package com.atguigu.gulimail.member.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.member.entity.IntegrationChangeHistoryEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 积分变化历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
interface IntegrationChangeHistoryService : IService<IntegrationChangeHistoryEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

