package com.atguigu.gulimail.ware.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.ware.entity.PurchaseEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 采购信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
interface PurchaseService : IService<PurchaseEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

