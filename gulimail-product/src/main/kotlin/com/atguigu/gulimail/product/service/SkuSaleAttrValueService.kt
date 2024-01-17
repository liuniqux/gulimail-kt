package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.SkuSaleAttrValueEntity
import com.baomidou.mybatisplus.extension.service.IService


/**
 * sku销售属性&值
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface SkuSaleAttrValueService : IService<SkuSaleAttrValueEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

