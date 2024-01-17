package com.atguigu.gulimail.order.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.order.entity.OrderEntity
import com.atguigu.gulimail.order.service.OrderService
import org.springframework.web.bind.annotation.*

/**
 * 订单
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@RestController
@RequestMapping("order/order")
class OrderController(
    val orderService: OrderService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:order:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = orderService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:order:info")
    fun info(@PathVariable("id") id: Long): R {
        val order: OrderEntity = orderService.getById(id)

        return R.ok().put("order", order)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:order:save")
    fun save(@RequestBody order: OrderEntity): R {
        orderService.save(order)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:order:update")
    fun update(@RequestBody order: OrderEntity): R {
        orderService.updateById(order)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:order:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        orderService.removeByIds(listOf(ids))

        return R.ok()
    }

}
