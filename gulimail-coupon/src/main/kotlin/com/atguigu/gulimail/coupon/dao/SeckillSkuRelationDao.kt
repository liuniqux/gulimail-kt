package com.atguigu.gulimail.coupon.dao

import com.atguigu.gulimail.coupon.entity.SeckillSkuRelationEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 秒杀活动商品关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@Mapper
interface SeckillSkuRelationDao : BaseMapper<SeckillSkuRelationEntity>
