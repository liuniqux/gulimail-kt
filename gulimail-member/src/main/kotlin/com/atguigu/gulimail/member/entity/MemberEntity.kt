package com.atguigu.gulimail.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 会员
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@TableName("ums_member")
data class MemberEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 会员等级id
     */
    val levelId: Long,

    /**
     * 用户名
     */
    val username: String,

    /**
     * 密码
     */
    val password: String,

    /**
     * 昵称
     */
    val nickname: String,

    /**
     * 手机号码
     */
    val mobile: String,

    /**
     * 邮箱
     */
    val email: String,

    /**
     * 头像
     */
    val header: String,

    /**
     * 性别
     */
    val gender: Int,

    /**
     * 生日
     */
    val birth: Date,

    /**
     * 所在城市
     */
    val city: String,

    /**
     * 职业
     */
    val job: String,

    /**
     * 个性签名
     */
    val sign: String,

    /**
     * 用户来源
     */
    val sourceType: Int,

    /**
     * 积分
     */
    val integration: Int,

    /**
     * 成长值
     */
    val growth: Int,

    /**
     * 启用状态
     */
    val status: Int,

    /**
     * 注册时间
     */
    val createTime: Date
) : Serializable
