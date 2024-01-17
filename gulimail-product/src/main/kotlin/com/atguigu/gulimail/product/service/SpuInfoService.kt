package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.SpuInfoEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * spu信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface SpuInfoService : IService<SpuInfoEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

