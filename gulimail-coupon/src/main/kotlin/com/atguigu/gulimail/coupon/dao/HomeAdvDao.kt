package com.atguigu.gulimail.coupon.dao

import com.atguigu.gulimail.coupon.entity.HomeAdvEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 首页轮播广告
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@Mapper
interface HomeAdvDao : BaseMapper<HomeAdvEntity>
