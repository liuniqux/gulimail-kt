package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.CouponEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 优惠券信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface CouponService : IService<CouponEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

