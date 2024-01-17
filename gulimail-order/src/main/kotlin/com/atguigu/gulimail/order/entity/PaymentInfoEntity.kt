package com.atguigu.gulimail.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 支付信息表
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@TableName("oms_payment_info")
data class PaymentInfoEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 订单号（对外业务号）
     */
    val orderSn: String,

    /**
     * 订单id
     */
    val orderId: Long,

    /**
     * 支付宝交易流水号
     */
    val alipayTradeNo: String,

    /**
     * 支付总金额
     */
    val totalAmount: BigDecimal,

    /**
     * 交易内容
     */
    val subject: String,

    /**
     * 支付状态
     */
    val paymentStatus: String,

    /**
     * 创建时间
     */
    val createTime: Date,

    /**
     * 确认时间
     */
    val confirmTime: Date,

    /**
     * 回调内容
     */
    val callbackContent: String,

    /**
     * 回调时间
     */
    val callbackTime: Date
) : Serializable
