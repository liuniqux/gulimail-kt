package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.SkuImagesEntity
import com.atguigu.gulimail.product.service.SkuImagesService
import org.springframework.web.bind.annotation.*


/**
 * sku图片
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/skuimages")
class SkuImagesController(private val skuImagesService: SkuImagesService) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:skuimages:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = skuImagesService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:skuimages:info")
    fun info(@PathVariable("id") id: Long): R {
        val skuImages: SkuImagesEntity = skuImagesService.getById(id)
        return R.ok().put("skuImages", skuImages)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:skuimages:save")
    fun save(@RequestBody skuImages: SkuImagesEntity): R {
        skuImagesService.save(skuImages)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:skuimages:update")
    fun update(@RequestBody skuImages: SkuImagesEntity): R {
        skuImagesService.updateById(skuImages)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:skuimages:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        skuImagesService.removeByIds(listOf(ids))
        return R.ok()
    }
}
