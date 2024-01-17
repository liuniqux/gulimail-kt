package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 商品会员价格
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@TableName("sms_member_price")
data class MemberPriceEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * sku_id
     */
    val skuId: Long,

    /**
     * 会员等级id
     */
    val memberLevelId: Long,

    /**
     * 会员等级名
     */
    val memberLevelName: String,

    /**
     * 会员对应价格
     */
    val memberPrice: BigDecimal,

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    val addOther: Int
) : Serializable
