package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.MemberPriceEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品会员价格
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
interface MemberPriceService : IService<MemberPriceEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

