package com.atguigu.gulimail.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 订单配置信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@TableName("oms_order_setting")
data class OrderSettingEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 秒杀订单超时关闭时间(分)
     */
    val flashOrderOvertime: Int,

    /**
     * 正常订单超时时间(分)
     */
    val normalOrderOvertime: Int,

    /**
     * 发货后自动确认收货时间（天）
     */
    val confirmOvertime: Int,

    /**
     * 自动完成交易时间，不能申请退货（天）
     */
    val finishOvertime: Int,

    /**
     * 订单完成后自动好评时间（天）
     */
    val commentOvertime: Int,

    /**
     * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     */
    val memberLevel: Int
) : Serializable
