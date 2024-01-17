package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.CategoryEntity
import com.atguigu.gulimail.product.service.CategoryService
import org.springframework.web.bind.annotation.*


/**
 * 商品三级分类
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/category")
class CategoryController(
    private val categoryService: CategoryService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:category:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = categoryService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    // @RequiresPermissions("product:category:info")
    fun info(@PathVariable("catId") catId: Long): R {
        val category: CategoryEntity = categoryService.getById(catId)

        return R.ok().put("category", category)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:category:save")
    fun save(@RequestBody category: CategoryEntity): R {
        categoryService.save(category)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:category:update")
    fun update(@RequestBody category: CategoryEntity): R {
        categoryService.updateById(category)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:category:delete")
    fun delete(@RequestBody catIds: Array<Long>): R {
        categoryService.removeByIds(listOf(catIds))

        return R.ok()
    }
}
