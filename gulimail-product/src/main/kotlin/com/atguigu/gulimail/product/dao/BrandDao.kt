package com.atguigu.gulimail.product.dao

import com.atguigu.gulimail.product.entity.BrandEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 品牌
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@Mapper
interface BrandDao : BaseMapper<BrandEntity>
