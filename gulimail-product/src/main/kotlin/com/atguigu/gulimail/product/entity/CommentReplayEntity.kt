package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 商品评价回复关系
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_comment_replay")
data class CommentReplayEntity(
    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 评论id
     */
    val commentId: Long,

    /**
     * 回复id
     */
    val replyId: Long
) : Serializable