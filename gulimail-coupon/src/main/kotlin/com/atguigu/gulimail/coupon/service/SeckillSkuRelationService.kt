package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.SeckillSkuRelationEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 秒杀活动商品关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
interface SeckillSkuRelationService : IService<SeckillSkuRelationEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

