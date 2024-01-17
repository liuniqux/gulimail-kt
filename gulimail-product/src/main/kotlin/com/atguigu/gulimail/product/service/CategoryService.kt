package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.CategoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品三级分类
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface CategoryService : IService<CategoryEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

