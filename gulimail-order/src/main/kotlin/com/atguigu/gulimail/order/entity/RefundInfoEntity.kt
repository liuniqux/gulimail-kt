package com.atguigu.gulimail.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 退款信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@TableName("oms_refund_info")
data class RefundInfoEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 退款的订单
     */
    val orderReturnId: Long,

    /**
     * 退款金额
     */
    val refund: BigDecimal,

    /**
     * 退款交易流水号
     */
    val refundSn: String,

    /**
     * 退款状态
     */
    val refundStatus: Int,

    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    val refundChannel: Int,

    /**
     *
     */
    val refundContent: String
) : Serializable
