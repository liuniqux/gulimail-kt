package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * sku图片
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_sku_images")
data class SkuImagesEntity(
    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * sku_id
     */
    val skuId: Long,

    /**
     * 图片地址
     */
    val imgUrl: String,

    /**
     * 排序
     */
    val imgSort: Int,

    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
    val defaultImg: Int
) :
    Serializable