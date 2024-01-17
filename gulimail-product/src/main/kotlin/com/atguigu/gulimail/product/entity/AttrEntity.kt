package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 商品属性
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_attr")
data class AttrEntity(
    /**
     * 属性id
     */
    @TableId
    val attrId: Long,
    /**
     * 属性名
     */
    val attrName: String,
    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    val searchType: Int,
    /**
     * 属性图标
     */
    val icon: String,
    /**
     * 可选值列表
     */
    val valueSelect: String,
    /**
     * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
     */
    val attrType: Int,
    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
    val enable: Long,
    /**
     * 所属分类
     */
    val catelogId: Long,
    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    val showDesc: Int
) : Serializable
