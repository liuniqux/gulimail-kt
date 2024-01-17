package com.atguigu.gulimail.order.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.order.dao.OrderSettingDao
import com.atguigu.gulimail.order.entity.OrderSettingEntity
import com.atguigu.gulimail.order.service.OrderSettingService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("orderSettingService")
class OrderSettingServiceImpl : ServiceImpl<OrderSettingDao, OrderSettingEntity>(), OrderSettingService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<OrderSettingEntity> = this.page(
            Query<OrderSettingEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}