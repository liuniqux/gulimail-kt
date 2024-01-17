package com.atguigu.gulimail.member.dao

import com.atguigu.gulimail.member.entity.MemberCollectSubjectEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 会员收藏的专题活动
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@Mapper
interface MemberCollectSubjectDao : BaseMapper<MemberCollectSubjectEntity>
