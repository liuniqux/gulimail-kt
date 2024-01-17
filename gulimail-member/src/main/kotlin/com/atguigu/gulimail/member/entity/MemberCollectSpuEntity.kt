package com.atguigu.gulimail.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 会员收藏的商品
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@TableName("ums_member_collect_spu")
data class MemberCollectSpuEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 会员id
     */
    val memberId: Long,

    /**
     * spu_id
     */
    val spuId: Long,

    /**
     * spu_name
     */
    val spuName: String,

    /**
     * spu_img
     */
    val spuImg: String,

    /**
     * create_time
     */
    val createTime: Date
) : Serializable
