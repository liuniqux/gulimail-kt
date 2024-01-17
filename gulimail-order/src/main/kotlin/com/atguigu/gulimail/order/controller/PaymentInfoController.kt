package com.atguigu.gulimail.order.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.order.entity.PaymentInfoEntity
import com.atguigu.gulimail.order.service.PaymentInfoService
import org.springframework.web.bind.annotation.*

/**
 * 支付信息表
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@RestController
@RequestMapping("order/paymentinfo")
class PaymentInfoController(
    val paymentInfoService: PaymentInfoService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:paymentinfo:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = paymentInfoService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:paymentinfo:info")
    fun info(@PathVariable("id") id: Long): R {
        val paymentInfo: PaymentInfoEntity = paymentInfoService.getById(id)

        return R.ok().put("paymentInfo", paymentInfo)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:paymentinfo:save")
    fun save(@RequestBody paymentInfo: PaymentInfoEntity): R {
        paymentInfoService.save(paymentInfo)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:paymentinfo:update")
    fun update(@RequestBody paymentInfo: PaymentInfoEntity): R {
        paymentInfoService.updateById(paymentInfo)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:paymentinfo:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        paymentInfoService.removeByIds(listOf(ids))

        return R.ok()
    }

}
