package com.atguigu.gulimail.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 退货原因
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@TableName("oms_order_return_reason")
data class OrderReturnReasonEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 退货原因名
     */
    val name: String,

    /**
     * 排序
     */
    val sort: Int,

    /**
     * 启用状态
     */
    val status: Int,

    /**
     * create_time
     */
    val createTime: Date
) : Serializable
