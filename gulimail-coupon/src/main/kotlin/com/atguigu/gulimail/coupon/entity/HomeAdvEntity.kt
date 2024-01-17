package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 首页轮播广告
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_home_adv")
data class HomeAdvEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 名字
     */
    val name: String,

    /**
     * 图片地址
     */
    val pic: String,

    /**
     * 开始时间
     */
    val startTime: Date,

    /**
     * 结束时间
     */
    val endTime: Date,

    /**
     * 状态
     */
    val status: Int,

    /**
     * 点击数
     */
    val clickCount: Int,

    /**
     * 广告详情连接地址
     */
    val url: String,

    /**
     * 备注
     */
    val note: String,

    /**
     * 排序
     */
    val sort: Int,

    /**
     * 发布者
     */
    val publisherId: Long,

    /**
     * 审核者
     */
    val authId: Long
) : Serializable
