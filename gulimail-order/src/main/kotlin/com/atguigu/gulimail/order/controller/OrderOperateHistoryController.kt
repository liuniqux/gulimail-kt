package com.atguigu.gulimail.order.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.order.entity.OrderOperateHistoryEntity
import com.atguigu.gulimail.order.service.OrderOperateHistoryService
import org.springframework.web.bind.annotation.*

/**
 * 订单操作历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@RestController
@RequestMapping("order/orderoperatehistory")
class OrderOperateHistoryController(
    val orderOperateHistoryService: OrderOperateHistoryService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:orderoperatehistory:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = orderOperateHistoryService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:orderoperatehistory:info")
    fun info(@PathVariable("id") id: Long): R {
        val orderOperateHistory: OrderOperateHistoryEntity = orderOperateHistoryService.getById(id)

        return R.ok().put("orderOperateHistory", orderOperateHistory)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:orderoperatehistory:save")
    fun save(@RequestBody orderOperateHistory: OrderOperateHistoryEntity): R {
        orderOperateHistoryService.save(orderOperateHistory)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:orderoperatehistory:update")
    fun update(@RequestBody orderOperateHistory: OrderOperateHistoryEntity): R {
        orderOperateHistoryService.updateById(orderOperateHistory)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:orderoperatehistory:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        orderOperateHistoryService.removeByIds(listOf(ids))

        return R.ok()
    }

}
