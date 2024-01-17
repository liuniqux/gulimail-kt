package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 商品三级分类
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_category")
data class CategoryEntity(
    /**
     * 分类id
     */
    @TableId
    val catId: Long,

    /**
     * 分类名称
     */
    val name: String,

    /**
     * 父分类id
     */
    val parentCid: Long,

    /**
     * 层级
     */
    val catLevel: Int,

    /**
     * 是否显示[0-不显示，1显示]
     */
    val showStatus: Int,

    /**
     * 排序
     */
    val sort: Int,

    /**
     * 图标地址
     */
    val icon: String,

    /**
     * 计量单位
     */
    val productUnit: String,

    /**
     * 商品数量
     */
    val productCount: Int
) : Serializable
