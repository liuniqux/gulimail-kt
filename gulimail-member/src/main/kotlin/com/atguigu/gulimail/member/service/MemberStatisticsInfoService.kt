package com.atguigu.gulimail.member.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.member.entity.MemberStatisticsInfoEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 会员统计信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
interface MemberStatisticsInfoService : IService<MemberStatisticsInfoEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

