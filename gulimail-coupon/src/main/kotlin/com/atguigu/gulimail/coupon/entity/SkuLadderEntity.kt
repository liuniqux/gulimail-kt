package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 商品阶梯价格
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@TableName("sms_sku_ladder")
data class SkuLadderEntity(

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
     * 满几件
     */
    val fullCount: Int,

    /**
     * 打几折
     */
    val discount: BigDecimal,

    /**
     * 折后价
     */
    val price: BigDecimal,

    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    val addOther: Int
) : Serializable
