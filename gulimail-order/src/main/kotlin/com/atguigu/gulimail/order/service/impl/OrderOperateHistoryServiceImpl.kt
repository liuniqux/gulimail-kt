package com.atguigu.gulimail.order.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.order.dao.OrderOperateHistoryDao
import com.atguigu.gulimail.order.entity.OrderOperateHistoryEntity
import com.atguigu.gulimail.order.service.OrderOperateHistoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderOperateHistoryService")
class OrderOperateHistoryServiceImpl : ServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity>(),
    OrderOperateHistoryService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<OrderOperateHistoryEntity> = this.page(
            Query<OrderOperateHistoryEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}