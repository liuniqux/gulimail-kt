package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 商品满减信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@TableName("sms_sku_full_reduction")
data class SkuFullReductionEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * spu_id
     */
    val skuId: Long,

    /**
     * 满多少
     */
    val fullPrice: BigDecimal,

    /**
     * 减多少
     */
    val reducePrice: BigDecimal,

    /**
     * 是否参与其他优惠
     */
    val addOther: Int
) : Serializable
