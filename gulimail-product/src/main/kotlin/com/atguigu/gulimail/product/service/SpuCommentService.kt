package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.SpuCommentEntity
import com.baomidou.mybatisplus.extension.service.IService


/**
 * 商品评价
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface SpuCommentService : IService<SpuCommentEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

