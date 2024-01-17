package com.atguigu.gulimail.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 订单操作历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@TableName("oms_order_operate_history")
data class OrderOperateHistoryEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 订单id
     */
    val orderId: Long,

    /**
     * 操作人[用户；系统；后台管理员]
     */
    val operateMan: String,

    /**
     * 操作时间
     */
    val createTime: Date,

    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    val orderStatus: Int,

    /**
     * 备注
     */
    val note: String
) : Serializable
