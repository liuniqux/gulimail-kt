package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.SpuImagesEntity
import com.atguigu.gulimail.product.service.SpuImagesService
import org.springframework.web.bind.annotation.*


/**
 * spu图片
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/spuimages")
class SpuImagesController(private val spuImagesService: SpuImagesService) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:spuimages:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = spuImagesService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:spuimages:info")
    fun info(@PathVariable("id") id: Long): R {
        val spuImages: SpuImagesEntity = spuImagesService.getById(id)
        return R.ok().put("spuImages", spuImages)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:spuimages:save")
    fun save(@RequestBody spuImages: SpuImagesEntity): R {
        spuImagesService.save(spuImages)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:spuimages:update")
    fun update(@RequestBody spuImages: SpuImagesEntity): R {
        spuImagesService.updateById(spuImages)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:spuimages:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        spuImagesService.removeByIds(listOf(ids))
        return R.ok()
    }
}

