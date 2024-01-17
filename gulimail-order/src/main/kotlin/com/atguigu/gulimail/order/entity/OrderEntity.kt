package com.atguigu.gulimail.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 订单
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@TableName("oms_order")
data class OrderEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * member_id
     */
    val memberId: Long,

    /**
     * 订单号
     */
    val orderSn: String,

    /**
     * 使用的优惠券
     */
    val couponId: Long,

    /**
     * create_time
     */
    val createTime: Date,

    /**
     * 用户名
     */
    val memberUsername: String,

    /**
     * 订单总额
     */
    val totalAmount: BigDecimal,

    /**
     * 应付总额
     */
    val payAmount: BigDecimal,

    /**
     * 运费金额
     */
    val freightAmount: BigDecimal,

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    val promotionAmount: BigDecimal,

    /**
     * 积分抵扣金额
     */
    val integrationAmount: BigDecimal,

    /**
     * 优惠券抵扣金额
     */
    val couponAmount: BigDecimal,

    /**
     * 后台调整订单使用的折扣金额
     */
    val discountAmount: BigDecimal,

    /**
     * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
     */
    val payType: Int,

    /**
     * 订单来源[0->PC订单；1->app订单]
     */
    val sourceType: Int,

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    val status: Int,

    /**
     * 物流公司(配送方式)
     */
    val deliveryCompany: String,

    /**
     * 物流单号
     */
    val deliverySn: String,

    /**
     * 自动确认时间（天）
     */
    val autoConfirmDay: Int,

    /**
     * 可以获得的积分
     */
    val integration: Int,

    /**
     * 可以获得的成长值
     */
    val growth: Int,

    /**
     * 发票类型[0->不开发票；1->电子发票；2->纸质发票]
     */
    val billType: Int,

    /**
     * 发票抬头
     */
    val billHeader: String,

    /**
     * 发票内容
     */
    val billContent: String,

    /**
     * 收票人电话
     */
    val billReceiverPhone: String,

    /**
     * 收票人邮箱
     */
    val billReceiverEmail: String,

    /**
     * 收货人姓名
     */
    val receiverName: String,

    /**
     * 收货人电话
     */
    val receiverPhone: String,

    /**
     * 收货人邮编
     */
    val receiverPostCode: String,

    /**
     * 省份/直辖市
     */
    val receiverProvince: String,

    /**
     * 城市
     */
    val receiverCity: String,

    /**
     * 区
     */
    val receiverRegion: String,

    /**
     * 详细地址
     */
    val receiverDetailAddress: String,

    /**
     * 订单备注
     */
    val note: String,

    /**
     * 确认收货状态[0->未确认；1->已确认]
     */
    val confirmStatus: Int,

    /**
     * 删除状态【0->未删除；1->已删除】
     */
    val deleteStatus: Int,

    /**
     * 下单时使用的积分
     */
    val useIntegration: Int,

    /**
     * 支付时间
     */
    val paymentTime: Date,

    /**
     * 发货时间
     */
    val deliveryTime: Date,

    /**
     * 确认收货时间
     */
    val receiveTime: Date,

    /**
     * 评价时间
     */
    val commentTime: Date,

    /**
     * 修改时间
     */
    val modifyTime: Date
) : Serializable
