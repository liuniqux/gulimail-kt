package com.atguigu.gulimail.ware.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.ware.entity.WareSkuEntity
import com.atguigu.gulimail.ware.service.WareSkuService
import org.springframework.web.bind.annotation.*

/**
 * 商品库存
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@RestController
@RequestMapping("ware/waresku")
class WareSkuController(
    val wareSkuService: WareSkuService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("ware:waresku:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = wareSkuService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("ware:waresku:info")
    fun info(@PathVariable("id") id: Long): R {
        val wareSku: WareSkuEntity = wareSkuService.getById(id)

        return R.ok().put("wareSku", wareSku)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("ware:waresku:save")
    fun save(@RequestBody wareSku: WareSkuEntity): R {
        wareSkuService.save(wareSku)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("ware:waresku:update")
    fun update(@RequestBody wareSku: WareSkuEntity): R {
        wareSkuService.updateById(wareSku)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("ware:waresku:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        wareSkuService.removeByIds(listOf(ids))

        return R.ok()
    }

}
