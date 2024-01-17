package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.ProductAttrValueEntity
import com.atguigu.gulimail.product.service.ProductAttrValueService
import org.springframework.web.bind.annotation.*


/**
 * spu属性值
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/productattrvalue")
class ProductAttrValueController(private val productAttrValueService: ProductAttrValueService) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // // @RequiresPermissions("product:productattrvalue:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = productAttrValueService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // // @RequiresPermissions("product:productattrvalue:info")
    fun info(@PathVariable("id") id: Long): R {
        val productAttrValue: ProductAttrValueEntity = productAttrValueService.getById(id)
        return R.ok().put("productAttrValue", productAttrValue)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // // @RequiresPermissions("product:productattrvalue:save")
    fun save(@RequestBody productAttrValue: ProductAttrValueEntity): R {
        productAttrValueService.save(productAttrValue)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // // @RequiresPermissions("product:productattrvalue:update")
    fun update(@RequestBody productAttrValue: ProductAttrValueEntity): R {
        productAttrValueService.updateById(productAttrValue)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // // @RequiresPermissions("product:productattrvalue:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        productAttrValueService.removeByIds(listOf(ids))
        return R.ok()
    }
}
