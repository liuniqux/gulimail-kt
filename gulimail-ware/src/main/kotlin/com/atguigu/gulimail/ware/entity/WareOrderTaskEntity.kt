package com.atguigu.gulimail.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 库存工作单
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@TableName("wms_ware_order_task")
data class WareOrderTaskEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * order_id
     */
    val orderId: Long,

    /**
     * order_sn
     */
    val orderSn: String,

    /**
     * 收货人
     */
    val consignee: String,

    /**
     * 收货人电话
     */
    val consigneeTel: String,

    /**
     * 配送地址
     */
    val deliveryAddress: String,

    /**
     * 订单备注
     */
    val orderComment: String,

    /**
     * 付款方式【 1:在线付款 2:货到付款】
     */
    val paymentWay: Int,

    /**
     * 任务状态
     */
    val taskStatus: Int,

    /**
     * 订单描述
     */
    val orderBody: String,

    /**
     * 物流单号
     */
    val trackingNo: String,

    /**
     * create_time
     */
    val createTime: Date,

    /**
     * 仓库id
     */
    val wareId: Long,

    /**
     * 工作单备注
     */
    val taskComment: String
) : Serializable
