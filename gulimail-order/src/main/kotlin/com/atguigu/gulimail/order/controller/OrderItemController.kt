package com.atguigu.gulimail.order.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.order.entity.OrderItemEntity
import com.atguigu.gulimail.order.service.OrderItemService
import org.springframework.web.bind.annotation.*

/**
 * 订单项信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@RestController
@RequestMapping("order/orderitem")
class OrderItemController(
    val orderItemService: OrderItemService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:orderitem:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = orderItemService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:orderitem:info")
    fun info(@PathVariable("id") id: Long): R {
        val orderItem: OrderItemEntity = orderItemService.getById(id)

        return R.ok().put("orderItem", orderItem)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:orderitem:save")
    fun save(@RequestBody orderItem: OrderItemEntity): R {
        orderItemService.save(orderItem)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:orderitem:update")
    fun update(@RequestBody orderItem: OrderItemEntity): R {
        orderItemService.updateById(orderItem)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:orderitem:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        orderItemService.removeByIds(listOf(ids))

        return R.ok()
    }

}
