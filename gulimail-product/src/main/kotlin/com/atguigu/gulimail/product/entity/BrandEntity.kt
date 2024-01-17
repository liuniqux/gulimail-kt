package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 品牌
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_brand")
data class BrandEntity(
    /**
     * 品牌id
     */
    @TableId
    val brandId: Long,

    /**
     * 品牌名
     */
    val name: String,

    /**
     * 品牌logo地址
     */
    val logo: String,

    /**
     * 介绍
     */
    val descript: String,

    /**
     * 显示状态[0-不显示；1-显示]
     */
    val showStatus: Int,

    /**
     * 检索首字母
     */
    val firstLetter: String,
    /**
     * 排序
     */
    val sort: Int
) : Serializable {
    constructor(name: String, descript: String) : this(1L, name, "", descript, 1, "", 1)
}
