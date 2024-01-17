package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.HomeSubjectSpuEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 专题商品
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface HomeSubjectSpuService : IService<HomeSubjectSpuEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

