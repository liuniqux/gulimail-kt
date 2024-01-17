package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 优惠券与产品关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_coupon_spu_relation")
data class CouponSpuRelationEntity(

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
     * spu_id
     */
    val spuId: Long,

    /**
     * spu_name
     */
    val spuName: String
) : Serializable
