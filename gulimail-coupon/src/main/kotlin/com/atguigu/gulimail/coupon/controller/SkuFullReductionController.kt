package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.SkuFullReductionEntity
import com.atguigu.gulimail.coupon.service.SkuFullReductionService
import org.springframework.web.bind.annotation.*

/**
 * 商品满减信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@RestController
@RequestMapping("coupon/skufullreduction")
class SkuFullReductionController(
    val skuFullReductionService: SkuFullReductionService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:skufullreduction:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = skuFullReductionService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:skufullreduction:info")
    fun info(@PathVariable("id") id: Long): R {
        val skuFullReduction: SkuFullReductionEntity = skuFullReductionService.getById(id)

        return R.ok().put("skuFullReduction", skuFullReduction)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:skufullreduction:save")
    fun save(@RequestBody skuFullReduction: SkuFullReductionEntity): R {
        skuFullReductionService.save(skuFullReduction)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:skufullreduction:update")
    fun update(@RequestBody skuFullReduction: SkuFullReductionEntity): R {
        skuFullReductionService.updateById(skuFullReduction)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:skufullreduction:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        skuFullReductionService.removeByIds(listOf(ids))

        return R.ok()
    }

}
