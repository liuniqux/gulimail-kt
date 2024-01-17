package com.atguigu.gulimail.order.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.order.dao.OrderItemDao
import com.atguigu.gulimail.order.entity.OrderItemEntity
import com.atguigu.gulimail.order.service.OrderItemService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderItemService")
class OrderItemServiceImpl : ServiceImpl<OrderItemDao, OrderItemEntity>(), OrderItemService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<OrderItemEntity> = this.page(
            Query<OrderItemEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}