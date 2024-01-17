package com.atguigu.gulimail.order.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.order.entity.OrderReturnReasonEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 退货原因
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
interface OrderReturnReasonService : IService<OrderReturnReasonEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

