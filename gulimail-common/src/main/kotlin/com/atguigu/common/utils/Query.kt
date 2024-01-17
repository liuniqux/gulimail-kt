package com.atguigu.common.utils

import com.atguigu.common.xss.SQLFilter
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.core.metadata.OrderItem
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import org.apache.commons.lang.StringUtils

const val DEFAULT_LIMIT: Long = 1L
const val DEFAULT_PAGE_SIZE: Long = 10L

/**
 * 查询参数
 */
class Query<T> {


    fun getPage(params: MutableMap<String, Any>): IPage<T> {
        return getPage(params, null, false)
    }

    fun getPage(params: MutableMap<String, Any>, defaultOrderField: String?, isAsc: Boolean): IPage<T> {
        // 分页参数
        var curPage = DEFAULT_LIMIT
        var limit = DEFAULT_PAGE_SIZE

        params[Constant.PAGE]?.let { curPage = it as Long }
        params[Constant.LIMIT]?.let { limit = it as Long }

        // 分页对象
        val page = Page<T>(curPage, limit)

        // 分页参数
        params[Constant.PAGE] = page

        // 排序字段
        // 防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
        val orderField = SQLFilter.sqlInject(params[Constant.ORDER_FIELD] as String?)
        val order = params[Constant.ORDER] as String?

        // 前端字段排序
        if (StringUtils.isNotEmpty(orderField) && StringUtils.isNotEmpty(order)) {
            return if (Constant.ASC.equals(order, ignoreCase = true)) {
                page.addOrder(OrderItem.asc(orderField))
            } else {
                page.addOrder(OrderItem.desc(orderField))
            }
        }

        // 没有排序字段，则不排序
        if (StringUtils.isBlank(defaultOrderField)) {
            return page
        }

        // 默认排序
        if (isAsc) {
            page.addOrder(OrderItem.asc(defaultOrderField))
        } else {
            page.addOrder(OrderItem.desc(defaultOrderField))
        }

        return page
    }
}
