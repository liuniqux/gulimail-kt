package com.atguigu.gulimail.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 库存工作单
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@TableName("wms_ware_order_task_detail")
data class WareOrderTaskDetailEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * sku_id
     */
    val skuId: Long,

    /**
     * sku_name
     */
    val skuName: String,

    /**
     * 购买个数
     */
    val skuNum: Int,

    /**
     * 工作单id
     */
    val taskId: Long
) : Serializable
