package com.atguigu.gulimail.ware.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.ware.entity.PurchaseEntity
import com.atguigu.gulimail.ware.service.PurchaseService
import org.springframework.web.bind.annotation.*

/**
 * 采购信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@RestController
@RequestMapping("ware/purchase")
class PurchaseController(
    val purchaseService: PurchaseService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("ware:purchase:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = purchaseService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("ware:purchase:info")
    fun info(@PathVariable("id") id: Long): R {
        val purchase: PurchaseEntity = purchaseService.getById(id)

        return R.ok().put("purchase", purchase)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("ware:purchase:save")
    fun save(@RequestBody purchase: PurchaseEntity): R {
        purchaseService.save(purchase)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("ware:purchase:update")
    fun update(@RequestBody purchase: PurchaseEntity): R {
        purchaseService.updateById(purchase)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("ware:purchase:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        purchaseService.removeByIds(listOf(ids))

        return R.ok()
    }

}
