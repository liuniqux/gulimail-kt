package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.SkuBoundsEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品sku积分设置
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
interface SkuBoundsService : IService<SkuBoundsEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

