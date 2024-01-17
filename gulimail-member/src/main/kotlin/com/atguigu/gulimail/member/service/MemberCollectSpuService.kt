package com.atguigu.gulimail.member.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.member.entity.MemberCollectSpuEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 会员收藏的商品
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
interface MemberCollectSpuService : IService<MemberCollectSpuEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

