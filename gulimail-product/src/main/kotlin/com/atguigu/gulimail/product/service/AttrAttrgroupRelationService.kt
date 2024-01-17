package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.AttrAttrgroupRelationEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 属性&属性分组关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface AttrAttrgroupRelationService : IService<AttrAttrgroupRelationEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

