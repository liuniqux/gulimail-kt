package com.atguigu.gulimail.product.dao

import com.atguigu.gulimail.product.entity.AttrAttrgroupRelationEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 属性&属性分组关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@Mapper
interface AttrAttrgroupRelationDao : BaseMapper<AttrAttrgroupRelationEntity>
