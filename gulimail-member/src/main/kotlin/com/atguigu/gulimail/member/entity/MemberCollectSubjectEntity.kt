package com.atguigu.gulimail.member.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 会员收藏的专题活动
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@TableName("ums_member_collect_subject")
data class MemberCollectSubjectEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * subject_id
     */
    val subjectId: Long,

    /**
     * subject_name
     */
    val subjectName: String,

    /**
     * subject_img
     */
    val subjectImg: String,

    /**
     * 活动url
     */
    val subjectUrll: String
) : Serializable
