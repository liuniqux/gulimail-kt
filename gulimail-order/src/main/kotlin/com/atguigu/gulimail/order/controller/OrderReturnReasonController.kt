package com.atguigu.gulimail.order.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.order.entity.OrderReturnReasonEntity
import com.atguigu.gulimail.order.service.OrderReturnReasonService
import org.springframework.web.bind.annotation.*

/**
 * 退货原因
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@RestController
@RequestMapping("order/orderreturnreason")
class OrderReturnReasonController(
    val orderReturnReasonService: OrderReturnReasonService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:orderreturnreason:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = orderReturnReasonService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:orderreturnreason:info")
    fun info(@PathVariable("id") id: Long): R {
        val orderReturnReason: OrderReturnReasonEntity = orderReturnReasonService.getById(id)

        return R.ok().put("orderReturnReason", orderReturnReason)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:orderreturnreason:save")
    fun save(@RequestBody orderReturnReason: OrderReturnReasonEntity): R {
        orderReturnReasonService.save(orderReturnReason)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:orderreturnreason:update")
    fun update(@RequestBody orderReturnReason: OrderReturnReasonEntity): R {
        orderReturnReasonService.updateById(orderReturnReason)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:orderreturnreason:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        orderReturnReasonService.removeByIds(listOf(ids))

        return R.ok()
    }

}
