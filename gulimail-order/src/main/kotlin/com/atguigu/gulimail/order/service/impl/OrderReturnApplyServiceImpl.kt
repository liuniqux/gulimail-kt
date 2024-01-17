package com.atguigu.gulimail.order.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.order.dao.OrderReturnApplyDao
import com.atguigu.gulimail.order.entity.OrderReturnApplyEntity
import com.atguigu.gulimail.order.service.OrderReturnApplyService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderReturnApplyService")
class OrderReturnApplyServiceImpl : ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity>(),
    OrderReturnApplyService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<OrderReturnApplyEntity> = this.page(
            Query<OrderReturnApplyEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}