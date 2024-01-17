package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * spu属性值
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_product_attr_value")
data class ProductAttrValueEntity(
    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 商品id
     */
    val spuId: Long,

    /**
     * 属性id
     */
    val attrId: Long,

    /**
     * 属性名
     */
    val attrName: String,

    /**
     * 属性值
     */
    val attrValue: String,

    /**
     * 顺序
     */
    val attrSort: Int,

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    val quickShow: Int
) : Serializable
