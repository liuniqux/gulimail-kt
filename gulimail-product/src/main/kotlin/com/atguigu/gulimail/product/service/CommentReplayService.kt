package com.atguigu.gulimail.product.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.product.entity.CommentReplayEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 商品评价回复关系
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
interface CommentReplayService : IService<CommentReplayEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

