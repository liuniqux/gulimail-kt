package com.atguigu.gulimail.coupon.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@TableName("sms_home_subject")
data class HomeSubjectEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 专题名字
     */
    val name: String,

    /**
     * 专题标题
     */
    val title: String,

    /**
     * 专题副标题
     */
    val subTitle: String,

    /**
     * 显示状态
     */
    val status: Int,

    /**
     * 详情连接
     */
    val url: String,

    /**
     * 排序
     */
    val sort: Int,

    /**
     * 专题图片地址
     */
    val img: String
) : Serializable
