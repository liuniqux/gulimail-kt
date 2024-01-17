package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 商品sku积分设置
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@TableName("sms_sku_bounds")
data class SkuBoundsEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     *
     */
    val skuId: Long,

    /**
     * 成长积分
     */
    val growBounds: BigDecimal,

    /**
     * 购物积分
     */
    val buyBounds: BigDecimal,

    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    val work: Int
) : Serializable
