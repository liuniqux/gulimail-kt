package com.atguigu.gulimail.product.dao

import com.atguigu.gulimail.product.entity.SpuInfoEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * spu信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@Mapper
interface SpuInfoDao : BaseMapper<SpuInfoEntity>
