package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 秒杀活动场次
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_seckill_session")
data class SeckillSessionEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 场次名称
     */
    val name: String,

    /**
     * 每日开始时间
     */
    val startTime: Date,

    /**
     * 每日结束时间
     */
    val endTime: Date,

    /**
     * 启用状态
     */
    val status: Int,

    /**
     * 创建时间
     */
    val createTime: Date
) : Serializable
