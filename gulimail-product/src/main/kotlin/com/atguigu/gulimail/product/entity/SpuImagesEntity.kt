package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * spu图片
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_spu_images")
data class SpuImagesEntity(
    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * spu_id
     */
    val spuId: Long,

    /**
     * 图片名
     */
    val imgName: String,

    /**
     * 图片地址
     */
    val imgUrl: String,

    /**
     * 顺序
     */
    val imgSort: Int,

    /**
     * 是否默认图
     */
    val defaultImg: Int
) : Serializable
