package com.atguigu.gulimail.ware.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable

/**
 * 仓库信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@TableName("wms_ware_info")
data class WareInfoEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * 仓库名
     */
    val name: String,

    /**
     * 仓库地址
     */
    val address: String,

    /**
     * 区域编码
     */
    val areacode: String
) : Serializable
