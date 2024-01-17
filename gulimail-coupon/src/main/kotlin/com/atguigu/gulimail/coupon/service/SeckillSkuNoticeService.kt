package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.SeckillSkuNoticeEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 秒杀商品通知订阅
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface SeckillSkuNoticeService : IService<SeckillSkuNoticeEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

