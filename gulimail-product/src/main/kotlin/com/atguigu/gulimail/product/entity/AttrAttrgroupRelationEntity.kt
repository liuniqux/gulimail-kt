package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 属性&属性分组关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_attr_attrgroup_relation")
data class AttrAttrgroupRelationEntity(
    /**
     * id
     */
    @TableId val id: Long,

    /**
     * 属性id
     */
    val attrId: Long,

    /**
     * 属性分组id
     */
    val attrGroupId: Long,

    /**
     * 属性组内排序
     */
    val attrSort: Int
) : Serializable

