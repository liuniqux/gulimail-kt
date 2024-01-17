package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.CouponHistoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 优惠券领取历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface CouponHistoryService : IService<CouponHistoryEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

