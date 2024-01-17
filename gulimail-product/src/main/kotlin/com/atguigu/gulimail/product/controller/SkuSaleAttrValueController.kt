package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.SkuSaleAttrValueEntity
import com.atguigu.gulimail.product.service.SkuSaleAttrValueService
import org.springframework.web.bind.annotation.*


/**
 * sku销售属性&值
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/skusaleattrvalue")
class SkuSaleAttrValueController(private val skuSaleAttrValueService: SkuSaleAttrValueService) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:skusaleattrvalue:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = skuSaleAttrValueService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:skusaleattrvalue:info")
    fun info(@PathVariable("id") id: Long): R {
        val skuSaleAttrValue: SkuSaleAttrValueEntity = skuSaleAttrValueService.getById(id)
        return R.ok().put("skuSaleAttrValue", skuSaleAttrValue)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:skusaleattrvalue:save")
    fun save(@RequestBody skuSaleAttrValue: SkuSaleAttrValueEntity): R {
        skuSaleAttrValueService.save(skuSaleAttrValue)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:skusaleattrvalue:update")
    fun update(@RequestBody skuSaleAttrValue: SkuSaleAttrValueEntity): R {
        skuSaleAttrValueService.updateById(skuSaleAttrValue)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:skusaleattrvalue:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        skuSaleAttrValueService.removeByIds(listOf(ids))
        return R.ok()
    }
}
