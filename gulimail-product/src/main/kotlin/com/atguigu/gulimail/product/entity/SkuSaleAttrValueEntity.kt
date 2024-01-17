package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * sku销售属性&值
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_sku_sale_attr_value")
data class SkuSaleAttrValueEntity(
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
     * attr_id
     */
    val attrId: Long,

    /**
     * 销售属性名
     */
    val attrName: String,

    /**
     * 销售属性值
     */
    val attrValue: String,

    /**
     * 顺序
     */
    val attrSort: Long
) : Serializable
