package com.atguigu.gulimail.ware.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.ware.entity.PurchaseDetailEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 *
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
interface PurchaseDetailService : IService<PurchaseDetailEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

