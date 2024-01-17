package com.atguigu.gulimail.member.dao

import com.atguigu.gulimail.member.entity.IntegrationChangeHistoryEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 积分变化历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@Mapper
interface IntegrationChangeHistoryDao : BaseMapper<IntegrationChangeHistoryEntity>
