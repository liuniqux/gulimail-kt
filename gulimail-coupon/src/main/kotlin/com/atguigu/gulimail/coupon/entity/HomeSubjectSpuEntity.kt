package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 专题商品
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_home_subject_spu")
data class HomeSubjectSpuEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 专题名字
     */
    val name: String,

    /**
     * 专题id
     */
    val subjectId: Long,

    /**
     * spu_id
     */
    val spuId: Long,

    /**
     * 排序
     */
    val sort: Int
) : Serializable
