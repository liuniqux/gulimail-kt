package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 优惠券分类关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_coupon_spu_category_relation")
data class CouponSpuCategoryRelationEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 优惠券id
     */
    val couponId: Long,

    /**
     * 产品分类id
     */
    val categoryId: Long,

    /**
     * 产品分类名称
     */
    val categoryName: String
) : Serializable
