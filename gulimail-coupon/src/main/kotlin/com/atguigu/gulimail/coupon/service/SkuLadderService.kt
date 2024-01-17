package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.SkuLadderEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品阶梯价格
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
interface SkuLadderService : IService<SkuLadderEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

