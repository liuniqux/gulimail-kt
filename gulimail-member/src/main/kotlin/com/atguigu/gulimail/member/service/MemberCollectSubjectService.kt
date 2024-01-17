package com.atguigu.gulimail.member.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.member.entity.MemberCollectSubjectEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 会员收藏的专题活动
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
interface MemberCollectSubjectService : IService<MemberCollectSubjectEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

