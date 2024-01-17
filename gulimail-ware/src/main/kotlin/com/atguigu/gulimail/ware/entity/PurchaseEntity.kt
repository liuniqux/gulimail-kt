package com.atguigu.gulimail.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * 采购信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@TableName("wms_purchase")
data class PurchaseEntity(

    /**
     *
     */
    @TableId
    val id: Long,

    /**
     *
     */
    val assigneeId: Long,

    /**
     *
     */
    val assigneeName: String,

    /**
     *
     */
    val phone: String,

    /**
     *
     */
    val priority: Int,

    /**
     *
     */
    val status: Int,

    /**
     *
     */
    val wareId: Long,

    /**
     *
     */
    val amount: BigDecimal,

    /**
     *
     */
    val createTime: Date,

    /**
     *
     */
    val updateTime: Date
) : Serializable
