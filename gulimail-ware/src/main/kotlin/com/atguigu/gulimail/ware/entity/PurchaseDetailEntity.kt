package com.atguigu.gulimail.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 *
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@TableName("wms_purchase_detail")
data class PurchaseDetailEntity(

    /**
     *
     */
    @TableId
    val id: Long,

    /**
     * 采购单id
     */
    val purchaseId: Long,

    /**
     * 采购商品id
     */
    val skuId: Long,

    /**
     * 采购数量
     */
    val skuNum: Int,

    /**
     * 采购金额
     */
    val skuPrice: BigDecimal,

    /**
     * 仓库id
     */
    val wareId: Long,

    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    val status: Int
) : Serializable
