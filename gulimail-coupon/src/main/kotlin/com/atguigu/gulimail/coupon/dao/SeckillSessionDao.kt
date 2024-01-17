package com.atguigu.gulimail.coupon.dao

import com.atguigu.gulimail.coupon.entity.SeckillSessionEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 秒杀活动场次
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@Mapper
interface SeckillSessionDao : BaseMapper<SeckillSessionEntity>
