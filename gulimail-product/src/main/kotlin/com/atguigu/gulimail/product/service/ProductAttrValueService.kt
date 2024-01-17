package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.ProductAttrValueEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * spu属性值
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface ProductAttrValueService : IService<ProductAttrValueEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

