package com.atguigu.common.utils

import com.baomidou.mybatisplus.core.metadata.IPage
import java.io.Serializable

/**
 * 分页工具类
 */
class PageUtils : Serializable {
    val serialVersionUID: Long = 1L

    /**
     * 总记录数
     */
    var totalCount: Int

    /**
     * 每页记录数
     */
    var pageSize: Int

    /**
     * 总页数
     */
    var totalPage: Int

    /**
     * 当前页数
     */
    var currPage: Int

    /**
     * 列表数据
     */
    var list: List<*>

    /**
     * 分页
     *
     * @param list 列表数据
     * @param totalCount 总记录数
     * @param pageSize 每页记录数
     * @param currPage 当前页数
     */
    constructor(list: List<*>, totalCount: Int, pageSize: Int, currPage: Int) {
        this.list = list
        this.totalCount = totalCount
        this.pageSize = pageSize
        this.currPage = currPage
        this.totalPage = kotlin.math.ceil(totalCount.toDouble() / pageSize).toInt()
    }

    /**
     * 分页
     */
    constructor(page: IPage<*>) {
        this.list = page.records
        this.totalCount = page.total.toInt()
        this.pageSize = page.size.toInt()
        this.currPage = page.current.toInt()
        this.totalPage = page.pages.toInt()
    }
}
