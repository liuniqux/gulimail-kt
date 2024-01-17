package com.atguigu.gulimail.ware.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.ware.entity.WareSkuEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品库存
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
interface WareSkuService : IService<WareSkuEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

