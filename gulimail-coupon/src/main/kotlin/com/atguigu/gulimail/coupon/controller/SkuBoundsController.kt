package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.SkuBoundsEntity
import com.atguigu.gulimail.coupon.service.SkuBoundsService
import org.springframework.web.bind.annotation.*

/**
 * 商品sku积分设置
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@RestController
@RequestMapping("coupon/skubounds")
class SkuBoundsController(
    val skuBoundsService: SkuBoundsService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:skubounds:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = skuBoundsService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:skubounds:info")
    fun info(@PathVariable("id") id: Long): R {
        val skuBounds: SkuBoundsEntity = skuBoundsService.getById(id)

        return R.ok().put("skuBounds", skuBounds)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:skubounds:save")
    fun save(@RequestBody skuBounds: SkuBoundsEntity): R {
        skuBoundsService.save(skuBounds)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:skubounds:update")
    fun update(@RequestBody skuBounds: SkuBoundsEntity): R {
        skuBoundsService.updateById(skuBounds)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:skubounds:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        skuBoundsService.removeByIds(listOf(ids))

        return R.ok()
    }

}
