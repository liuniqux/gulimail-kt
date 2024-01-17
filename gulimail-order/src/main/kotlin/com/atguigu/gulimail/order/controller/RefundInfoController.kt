package com.atguigu.gulimail.order.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.order.entity.RefundInfoEntity
import com.atguigu.gulimail.order.service.RefundInfoService
import org.springframework.web.bind.annotation.*

/**
 * 退款信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@RestController
@RequestMapping("order/refundinfo")
class RefundInfoController(
    val refundInfoService: RefundInfoService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:refundinfo:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = refundInfoService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:refundinfo:info")
    fun info(@PathVariable("id") id: Long): R {
        val refundInfo: RefundInfoEntity = refundInfoService.getById(id)

        return R.ok().put("refundInfo", refundInfo)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:refundinfo:save")
    fun save(@RequestBody refundInfo: RefundInfoEntity): R {
        refundInfoService.save(refundInfo)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:refundinfo:update")
    fun update(@RequestBody refundInfo: RefundInfoEntity): R {
        refundInfoService.updateById(refundInfo)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:refundinfo:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        refundInfoService.removeByIds(listOf(ids))

        return R.ok()
    }

}
