package com.atguigu.gulimail.order.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.order.dao.OrderReturnReasonDao
import com.atguigu.gulimail.order.entity.OrderReturnReasonEntity
import com.atguigu.gulimail.order.service.OrderReturnReasonService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderReturnReasonService")
class OrderReturnReasonServiceImpl : ServiceImpl<OrderReturnReasonDao, OrderReturnReasonEntity>(),
    OrderReturnReasonService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<OrderReturnReasonEntity> = this.page(
            Query<OrderReturnReasonEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}