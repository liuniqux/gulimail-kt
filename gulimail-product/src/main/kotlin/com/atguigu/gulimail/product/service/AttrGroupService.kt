package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.AttrGroupEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 属性分组
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface AttrGroupService : IService<AttrGroupEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

