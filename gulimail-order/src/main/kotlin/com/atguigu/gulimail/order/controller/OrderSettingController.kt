package com.atguigu.gulimail.order.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.order.entity.OrderSettingEntity
import com.atguigu.gulimail.order.service.OrderSettingService
import org.springframework.web.bind.annotation.*

/**
 * 订单配置信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@RestController
@RequestMapping("order/ordersetting")
class OrderSettingController(
    val orderSettingService: OrderSettingService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:ordersetting:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = orderSettingService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:ordersetting:info")
    fun info(@PathVariable("id") id: Long): R {
        val orderSetting: OrderSettingEntity = orderSettingService.getById(id)

        return R.ok().put("orderSetting", orderSetting)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:ordersetting:save")
    fun save(@RequestBody orderSetting: OrderSettingEntity): R {
        orderSettingService.save(orderSetting)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:ordersetting:update")
    fun update(@RequestBody orderSetting: OrderSettingEntity): R {
        orderSettingService.updateById(orderSetting)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:ordersetting:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        orderSettingService.removeByIds(listOf(ids))

        return R.ok()
    }

}
