package com.atguigu.gulimail.coupon.dao

import com.atguigu.gulimail.coupon.entity.CouponHistoryEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 优惠券领取历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@Mapper
interface CouponHistoryDao : BaseMapper<CouponHistoryEntity>
