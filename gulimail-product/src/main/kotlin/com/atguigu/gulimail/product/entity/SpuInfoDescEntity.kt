package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * spu信息介绍
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_spu_info_desc")
data class SpuInfoDescEntity(
    /**
     * 商品id
     */
    @TableId
    val spuId: Long,

    /**
     * 商品介绍
     */
    val decript: String
) : Serializable
