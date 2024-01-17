package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 优惠券信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_coupon")
data class CouponEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
     */
    val couponType: Int,

    /**
     * 优惠券图片
     */
    val couponImg: String,

    /**
     * 优惠卷名字
     */
    val couponName: String,

    /**
     * 数量
     */
    val num: Int,

    /**
     * 金额
     */
    val amount: BigDecimal,

    /**
     * 每人限领张数
     */
    val perLimit: Int,

    /**
     * 使用门槛
     */
    val minPoint: BigDecimal,

    /**
     * 开始时间
     */
    val startTime: Date,

    /**
     * 结束时间
     */
    val endTime: Date,

    /**
     * 使用类型[0->全场通用；1->指定分类；2->指定商品]
     */
    val useType: Int,

    /**
     * 备注
     */
    val note: String,

    /**
     * 发行数量
     */
    val publishCount: Int,

    /**
     * 已使用数量
     */
    val useCount: Int,

    /**
     * 领取数量
     */
    val receiveCount: Int,

    /**
     * 可以领取的开始日期
     */
    val enableStartTime: Date,

    /**
     * 可以领取的结束日期
     */
    val enableEndTime: Date,

    /**
     * 优惠码
     */
    val code: String,

    /**
     * 可以领取的会员等级[0->不限等级，其他-对应等级]
     */
    val memberLevel: Int,

    /**
     * 发布状态[0-未发布，1-已发布]
     */
    val publish: Int
) : Serializable
