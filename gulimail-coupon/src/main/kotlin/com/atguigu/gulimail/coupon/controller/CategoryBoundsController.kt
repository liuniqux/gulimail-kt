package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.CategoryBoundsEntity
import com.atguigu.gulimail.coupon.service.CategoryBoundsService
import org.springframework.web.bind.annotation.*

/**
 * 商品分类积分设置
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/categorybounds")
class CategoryBoundsController(
    val categoryBoundsService: CategoryBoundsService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:categorybounds:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = categoryBoundsService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:categorybounds:info")
    fun info(@PathVariable("id") id: Long): R {
        val categoryBounds: CategoryBoundsEntity = categoryBoundsService.getById(id)

        return R.ok().put("categoryBounds", categoryBounds)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:categorybounds:save")
    fun save(@RequestBody categoryBounds: CategoryBoundsEntity): R {
        categoryBoundsService.save(categoryBounds)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:categorybounds:update")
    fun update(@RequestBody categoryBounds: CategoryBoundsEntity): R {
        categoryBoundsService.updateById(categoryBounds)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:categorybounds:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        categoryBoundsService.removeByIds(listOf(ids))

        return R.ok()
    }

}
