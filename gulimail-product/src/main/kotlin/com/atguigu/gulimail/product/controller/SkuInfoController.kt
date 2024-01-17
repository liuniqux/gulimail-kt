package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.SkuInfoEntity
import com.atguigu.gulimail.product.service.SkuInfoService
import org.springframework.web.bind.annotation.*


/**
 * sku信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/skuinfo")
class SkuInfoController(private val skuInfoService: SkuInfoService) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:skuinfo:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = skuInfoService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{skuId}")
    // @RequiresPermissions("product:skuinfo:info")
    fun info(@PathVariable("skuId") skuId: Long): R {
        val skuInfo: SkuInfoEntity = skuInfoService.getById(skuId)
        return R.ok().put("skuInfo", skuInfo)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:skuinfo:save")
    fun save(@RequestBody skuInfo: SkuInfoEntity): R {
        skuInfoService.save(skuInfo)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:skuinfo:update")
    fun update(@RequestBody skuInfo: SkuInfoEntity): R {
        skuInfoService.updateById(skuInfo)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:skuinfo:delete")
    fun delete(@RequestBody skuIds: Array<Long>): R {
        skuInfoService.removeByIds(listOf(skuIds))
        return R.ok()
    }
}
