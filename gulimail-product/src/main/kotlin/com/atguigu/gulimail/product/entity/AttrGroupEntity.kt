package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 属性分组
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_attr_group")
data class AttrGroupEntity(
    /**
     * 分组id
     */
    @TableId
    val attrGroupId: Long,

    /**
     * 组名
     */
    val attrGroupName: String,

    /**
     * 排序
     */
    val sort: Int,

    /**
     * 描述
     */
    val descript: String,

    /**
     * 组图标
     */
    val icon: String,

    /**
     * 所属分类id
     */
    val catelogId: Long
) : Serializable
