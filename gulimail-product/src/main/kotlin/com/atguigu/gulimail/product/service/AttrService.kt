package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.AttrEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品属性
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface AttrService : IService<AttrEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

