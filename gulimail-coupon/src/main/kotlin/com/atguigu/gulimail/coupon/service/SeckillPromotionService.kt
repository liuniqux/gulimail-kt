package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.SeckillPromotionEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 秒杀活动
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface SeckillPromotionService : IService<SeckillPromotionEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

