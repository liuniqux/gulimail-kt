package com.atguigu.gulimail.ware.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.ware.entity.PurchaseDetailEntity
import com.atguigu.gulimail.ware.service.PurchaseDetailService
import org.springframework.web.bind.annotation.*

/**
 *
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@RestController
@RequestMapping("ware/purchasedetail")
class PurchaseDetailController(
    val purchaseDetailService: PurchaseDetailService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("ware:purchasedetail:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = purchaseDetailService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("ware:purchasedetail:info")
    fun info(@PathVariable("id") id: Long): R {
        val purchaseDetail: PurchaseDetailEntity = purchaseDetailService.getById(id)

        return R.ok().put("purchaseDetail", purchaseDetail)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("ware:purchasedetail:save")
    fun save(@RequestBody purchaseDetail: PurchaseDetailEntity): R {
        purchaseDetailService.save(purchaseDetail)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("ware:purchasedetail:update")
    fun update(@RequestBody purchaseDetail: PurchaseDetailEntity): R {
        purchaseDetailService.updateById(purchaseDetail)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("ware:purchasedetail:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        purchaseDetailService.removeByIds(listOf(ids))

        return R.ok()
    }

}
