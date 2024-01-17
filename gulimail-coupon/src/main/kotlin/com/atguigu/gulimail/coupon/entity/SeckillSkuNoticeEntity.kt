package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 秒杀商品通知订阅
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_seckill_sku_notice")
data class SeckillSkuNoticeEntity(

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
     * sku_id
     */
    val skuId: Long,

    /**
     * 活动场次id
     */
    val sessionId: Long,

    /**
     * 订阅时间
     */
    val subcribeTime: Date,

    /**
     * 发送时间
     */
    val sendTime: Date,

    /**
     * 通知方式[0-短信，1-邮件]
     */
    val noticeType: Int
) : Serializable
