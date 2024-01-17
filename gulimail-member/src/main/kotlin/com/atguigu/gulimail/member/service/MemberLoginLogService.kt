package com.atguigu.gulimail.member.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.member.entity.MemberLoginLogEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 会员登录记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
interface MemberLoginLogService : IService<MemberLoginLogEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

