package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

/**
 * spu信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_spu_info")
data class SpuInfoEntity(
    /**
     * 商品id
     */
    @TableId
    val id: Long,

    /**
     * 商品名称
     */
    val spuName: String,

    /**
     * 商品描述
     */
    val spuDescription: String,

    /**
     * 所属分类id
     */
    val catalogId: Long,

    /**
     * 品牌id
     */
    val brandId: Long,

    /**
     *
     */
    val weight: BigDecimal,

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    val publishStatus: Int,

    /**
     *
     */
    val createTime: Date,

    /**
     *
     */
    val updateTime: Date
) : Serializable
