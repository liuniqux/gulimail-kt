package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * sku信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_sku_info")
data class SkuInfoEntity(
    /**
     * skuId
     */
    @TableId
    val skuId: Long,

    /**
     * spuId
     */
    val spuId: Long,

    /**
     * sku名称
     */
    val skuName: String,

    /**
     * sku介绍描述
     */
    val skuDesc: String,

    /**
     * 所属分类id
     */
    val catalogId: Long,

    /**
     * 品牌id
     */
    val brandId: Long,

    /**
     * 默认图片
     */
    val skuDefaultImg: String,

    /**
     * 标题
     */
    val skuTitle: String,

    /**
     * 副标题
     */
    val skuSubtitle: String,

    /**
     * 价格
     */
    val price: BigDecimal,

    /**
     * 销量
     */
    val saleCount: Long
) : Serializable
