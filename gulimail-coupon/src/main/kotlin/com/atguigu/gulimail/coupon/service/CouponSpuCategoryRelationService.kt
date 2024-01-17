package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.CouponSpuCategoryRelationEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 优惠券分类关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface CouponSpuCategoryRelationService : IService<CouponSpuCategoryRelationEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

