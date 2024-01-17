package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.SeckillSessionEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 秒杀活动场次
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface SeckillSessionService : IService<SeckillSessionEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

