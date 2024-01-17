package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.CategoryBoundsEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品分类积分设置
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface CategoryBoundsService : IService<CategoryBoundsEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

