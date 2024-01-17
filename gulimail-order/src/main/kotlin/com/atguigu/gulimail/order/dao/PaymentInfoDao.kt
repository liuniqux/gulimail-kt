package com.atguigu.gulimail.order.dao

import com.atguigu.gulimail.order.entity.PaymentInfoEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 支付信息表
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@Mapper
interface PaymentInfoDao : BaseMapper<PaymentInfoEntity>
