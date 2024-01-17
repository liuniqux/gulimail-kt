package com.atguigu.gulimail.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 会员统计信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@TableName("ums_member_statistics_info")
data class MemberStatisticsInfoEntity(

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
     * 累计消费金额
     */
    val consumeAmount: BigDecimal,

    /**
     * 累计优惠金额
     */
    val couponAmount: BigDecimal,

    /**
     * 订单数量
     */
    val orderCount: Int,

    /**
     * 优惠券数量
     */
    val couponCount: Int,

    /**
     * 评价数
     */
    val commentCount: Int,

    /**
     * 退货数量
     */
    val returnOrderCount: Int,

    /**
     * 登录次数
     */
    val loginCount: Int,

    /**
     * 关注数量
     */
    val attendCount: Int,

    /**
     * 粉丝数量
     */
    val fansCount: Int,

    /**
     * 收藏的商品数量
     */
    val collectProductCount: Int,

    /**
     * 收藏的专题活动数量
     */
    val collectSubjectCount: Int,

    /**
     * 收藏的评论数量
     */
    val collectCommentCount: Int,

    /**
     * 邀请的朋友数量
     */
    val inviteFriendCount: Int
) : Serializable
