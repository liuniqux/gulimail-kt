package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 秒杀活动
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_seckill_promotion")
data class SeckillPromotionEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 活动标题
     */
    val title: String,

    /**
     * 开始日期
     */
    val startTime: Date,

    /**
     * 结束日期
     */
    val endTime: Date,

    /**
     * 上下线状态
     */
    val status: Int,

    /**
     * 创建时间
     */
    val createTime: Date,

    /**
     * 创建人
     */
    val userId: Long
) : Serializable
