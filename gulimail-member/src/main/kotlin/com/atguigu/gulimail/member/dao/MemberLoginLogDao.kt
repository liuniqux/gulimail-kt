package com.atguigu.gulimail.member.dao

import com.atguigu.gulimail.member.entity.MemberLoginLogEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 会员登录记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@Mapper
interface MemberLoginLogDao : BaseMapper<MemberLoginLogEntity>
