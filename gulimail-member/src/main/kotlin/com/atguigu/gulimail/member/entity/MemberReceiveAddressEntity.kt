package com.atguigu.gulimail.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 会员收货地址
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@TableName("ums_member_receive_address")
data class MemberReceiveAddressEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * member_id
     */
    val memberId: Long,

    /**
     * 收货人姓名
     */
    val name: String,

    /**
     * 电话
     */
    val phone: String,

    /**
     * 邮政编码
     */
    val postCode: String,

    /**
     * 省份/直辖市
     */
    val province: String,

    /**
     * 城市
     */
    val city: String,

    /**
     * 区
     */
    val region: String,

    /**
     * 详细地址(街道)
     */
    val detailAddress: String,

    /**
     * 省市区代码
     */
    val areacode: String,

    /**
     * 是否默认
     */
    val defaultStatus: Int
) : Serializable
