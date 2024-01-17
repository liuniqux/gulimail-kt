package com.atguigu.gulimail.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 商品库存
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@TableName("wms_ware_sku")
data class WareSkuEntity(

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
     * 仓库id
     */
    val wareId: Long,

    /**
     * 库存数
     */
    val stock: Int,

    /**
     * sku_name
     */
    val skuName: String,

    /**
     * 锁定库存
     */
    val stockLocked: Int
) : Serializable
