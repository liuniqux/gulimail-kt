package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.BrandEntity
import com.atguigu.gulimail.product.service.BrandService
import org.springframework.web.bind.annotation.*


/**
 * 品牌
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/brand")
class BrandController(
    private val brandService: BrandService
) {


    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:brand:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = brandService.queryPage(params)

        return R.ok().put("page", page)
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    // @RequiresPermissions("product:brand:info")
    fun info(@PathVariable("brandId") brandId: Long): R {
        val brand: BrandEntity = brandService.getById(brandId)

        return R.ok().put("brand", brand)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:brand:save")
    fun save(@RequestBody brand: BrandEntity): R {
        brandService.save(brand)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:brand:update")
    fun update(@RequestBody brand: BrandEntity): R {
        brandService.updateById(brand)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:brand:delete")
    fun delete(@RequestBody brandIds: Array<Long>): R {
        brandService.removeByIds(listOf(brandIds))

        return R.ok()
    }

}
