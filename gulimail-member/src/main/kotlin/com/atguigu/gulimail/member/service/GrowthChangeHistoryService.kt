package com.atguigu.gulimail.member.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.member.entity.GrowthChangeHistoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 成长值变化历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
interface GrowthChangeHistoryService : IService<GrowthChangeHistoryEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

