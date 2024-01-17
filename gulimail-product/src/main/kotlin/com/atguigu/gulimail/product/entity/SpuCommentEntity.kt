package com.atguigu.gulimail.product.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.util.*

/**
 * 商品评价
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@TableName("pms_spu_comment")
data class SpuCommentEntity(
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
     * spu_id
     */
    val spuId: Long,

    /**
     * 商品名字
     */
    val spuName: String,

    /**
     * 会员昵称
     */
    val memberNickName: String,

    /**
     * 星级
     */
    val star: Int,

    /**
     * 会员ip
     */
    val memberIp: String,

    /**
     * 创建时间
     */
    val createTime: Date,

    /**
     * 显示状态[0-不显示，1-显示]
     */
    val showStatus: Int,

    /**
     * 购买时属性组合
     */
    val spuAttributes: String,

    /**
     * 点赞数
     */
    val likesCount: Int,

    /**
     * 回复数
     */
    val replyCount: Int,

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    val resources: String,

    /**
     * 内容
     */
    val content: String,

    /**
     * 用户头像
     */
    val memberIcon: String,

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    val commentType: Int,
) : Serializable
