package com.atguigu.gulimail.order.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.order.entity.OrderSettingEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 订单配置信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
interface OrderSettingService : IService<OrderSettingEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

