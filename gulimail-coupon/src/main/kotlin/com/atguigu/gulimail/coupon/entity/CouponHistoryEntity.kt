package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 优惠券领取历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_coupon_history")
data class CouponHistoryEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 优惠券id
     */
    val couponId: Long,

    /**
     * 会员id
     */
    val memberId: Long,

    /**
     * 会员名字
     */
    val memberNickName: String,

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    val getType: Int,

    /**
     * 创建时间
     */
    val createTime: Date,

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    val useType: Int,

    /**
     * 使用时间
     */
    val useTime: Date,

    /**
     * 订单id
     */
    val orderId: Long,

    /**
     * 订单号
     */
    val orderSn: Long
) : Serializable
