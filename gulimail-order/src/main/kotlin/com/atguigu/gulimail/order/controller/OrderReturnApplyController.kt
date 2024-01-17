package com.atguigu.gulimail.order.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.order.entity.OrderReturnApplyEntity
import com.atguigu.gulimail.order.service.OrderReturnApplyService
import org.springframework.web.bind.annotation.*

/**
 * 订单退货申请
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@RestController
@RequestMapping("order/orderreturnapply")
class OrderReturnApplyController(
    val orderReturnApplyService: OrderReturnApplyService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:orderreturnapply:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = orderReturnApplyService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:orderreturnapply:info")
    fun info(@PathVariable("id") id: Long): R {
        val orderReturnApply: OrderReturnApplyEntity = orderReturnApplyService.getById(id)

        return R.ok().put("orderReturnApply", orderReturnApply)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:orderreturnapply:save")
    fun save(@RequestBody orderReturnApply: OrderReturnApplyEntity): R {
        orderReturnApplyService.save(orderReturnApply)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:orderreturnapply:update")
    fun update(@RequestBody orderReturnApply: OrderReturnApplyEntity): R {
        orderReturnApplyService.updateById(orderReturnApply)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:orderreturnapply:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        orderReturnApplyService.removeByIds(listOf(ids))

        return R.ok()
    }

}
