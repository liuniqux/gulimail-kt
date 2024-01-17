package com.atguigu.gulimail.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 会员等级
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@TableName("ums_member_level")
data class MemberLevelEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 等级名称
     */
    val name: String,

    /**
     * 等级需要的成长值
     */
    val growthPoint: Int,

    /**
     * 是否为默认等级[0->不是；1->是]
     */
    val defaultStatus: Int,

    /**
     * 免运费标准
     */
    val freeFreightPoint: BigDecimal,

    /**
     * 每次评价获取的成长值
     */
    val commentGrowthPoint: Int,

    /**
     * 是否有免邮特权
     */
    val priviledgeFreeFreight: Int,

    /**
     * 是否有会员价格特权
     */
    val priviledgeMemberPrice: Int,

    /**
     * 是否有生日特权
     */
    val priviledgeBirthday: Int,

    /**
     * 备注
     */
    val note: String
) : Serializable
