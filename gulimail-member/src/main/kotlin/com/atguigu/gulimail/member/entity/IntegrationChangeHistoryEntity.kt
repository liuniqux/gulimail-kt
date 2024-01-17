package com.atguigu.gulimail.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 积分变化历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@TableName("ums_integration_change_history")
data class IntegrationChangeHistoryEntity(

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
     * create_time
     */
    val createTime: Date,

    /**
     * 变化的值
     */
    val changeCount: Int,

    /**
     * 备注
     */
    val note: String,

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    val sourceTyoe: Int
) : Serializable
