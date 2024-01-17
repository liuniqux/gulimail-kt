package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 秒杀活动商品关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@TableName("sms_seckill_sku_relation")
data class SeckillSkuRelationEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 活动id
     */
    val promotionId: Long,

    /**
     * 活动场次id
     */
    val promotionSessionId: Long,

    /**
     * 商品id
     */
    val skuId: Long,

    /**
     * 秒杀价格
     */
    val seckillPrice: BigDecimal,

    /**
     * 秒杀总量
     */
    val seckillCount: BigDecimal,

    /**
     * 每人限购数量
     */
    val seckillLimit: BigDecimal,

    /**
     * 排序
     */
    val seckillSort: Int
) : Serializable
