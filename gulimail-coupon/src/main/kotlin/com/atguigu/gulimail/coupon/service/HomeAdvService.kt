package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.HomeAdvEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 首页轮播广告
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface HomeAdvService : IService<HomeAdvEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

