package com.atguigu.gulimail.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 订单退货申请
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@TableName("oms_order_return_apply")
data class OrderReturnApplyEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * order_id
     */
    val orderId: Long,

    /**
     * 退货商品id
     */
    val skuId: Long,

    /**
     * 订单编号
     */
    val orderSn: String,

    /**
     * 申请时间
     */
    val createTime: Date,

    /**
     * 会员用户名
     */
    val memberUsername: String,

    /**
     * 退款金额
     */
    val returnAmount: BigDecimal,

    /**
     * 退货人姓名
     */
    val returnName: String,

    /**
     * 退货人电话
     */
    val returnPhone: String,

    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    val status: Int,

    /**
     * 处理时间
     */
    val handleTime: Date,

    /**
     * 商品图片
     */
    val skuImg: String,

    /**
     * 商品名称
     */
    val skuName: String,

    /**
     * 商品品牌
     */
    val skuBrand: String,

    /**
     * 商品销售属性(JSON)
     */
    val skuAttrsVals: String,

    /**
     * 退货数量
     */
    val skuCount: Int,

    /**
     * 商品单价
     */
    val skuPrice: BigDecimal,

    /**
     * 商品实际支付单价
     */
    val skuRealPrice: BigDecimal,

    /**
     * 原因
     */
    val reason: String,

    /**
     * 描述
     */
    val description: String,

    /**
     * 凭证图片，以逗号隔开
     */
    val descPics: String,

    /**
     * 处理备注
     */
    val handleNote: String,

    /**
     * 处理人员
     */
    val handleMan: String,

    /**
     * 收货人
     */
    val receiveMan: String,

    /**
     * 收货时间
     */
    val receiveTime: Date,

    /**
     * 收货备注
     */
    val receiveNote: String,

    /**
     * 收货电话
     */
    val receivePhone: String,

    /**
     * 公司收货地址
     */
    val companyAddress: String
) : Serializable
