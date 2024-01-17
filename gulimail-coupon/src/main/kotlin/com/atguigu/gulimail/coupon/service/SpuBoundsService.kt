package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.SpuBoundsEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品spu积分设置
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
interface SpuBoundsService : IService<SpuBoundsEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

