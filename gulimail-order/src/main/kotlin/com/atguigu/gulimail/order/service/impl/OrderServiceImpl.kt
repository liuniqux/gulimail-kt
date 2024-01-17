package com.atguigu.gulimail.order.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.order.dao.OrderDao
import com.atguigu.gulimail.order.entity.OrderEntity
import com.atguigu.gulimail.order.service.OrderService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderService")
class OrderServiceImpl : ServiceImpl<OrderDao, OrderEntity>(), OrderService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<OrderEntity> = this.page(
            Query<OrderEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}