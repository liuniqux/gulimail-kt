package com.atguigu.gulimail.ware.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.ware.entity.WareOrderTaskEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 库存工作单
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
interface WareOrderTaskService : IService<WareOrderTaskEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

