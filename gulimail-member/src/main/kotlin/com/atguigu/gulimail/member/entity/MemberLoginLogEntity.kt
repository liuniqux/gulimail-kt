package com.atguigu.gulimail.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 会员登录记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@TableName("ums_member_login_log")
data class MemberLoginLogEntity(

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
     * 创建时间
     */
    val createTime: Date,

    /**
     * ip
     */
    val ip: String,

    /**
     * city
     */
    val city: String,

    /**
     * 登录类型[1-web，2-app]
     */
    val loginType: Int
) : Serializable
