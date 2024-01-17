package com.atguigu.gulimail.ware.dao

import com.atguigu.gulimail.ware.entity.PurchaseEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 采购信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@Mapper
interface PurchaseDao : BaseMapper<PurchaseEntity>
