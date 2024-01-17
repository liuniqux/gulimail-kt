package com.atguigu.gulimail.order.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.order.entity.PaymentInfoEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 支付信息表
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
interface PaymentInfoService : IService<PaymentInfoEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

