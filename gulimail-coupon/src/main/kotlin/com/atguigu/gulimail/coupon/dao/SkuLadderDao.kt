package com.atguigu.gulimail.coupon.dao

import com.atguigu.gulimail.coupon.entity.SkuLadderEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 商品阶梯价格
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@Mapper
interface SkuLadderDao : BaseMapper<SkuLadderEntity>
