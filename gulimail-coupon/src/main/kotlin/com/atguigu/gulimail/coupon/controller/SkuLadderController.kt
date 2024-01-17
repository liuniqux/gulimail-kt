package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.SkuLadderEntity
import com.atguigu.gulimail.coupon.service.SkuLadderService
import org.springframework.web.bind.annotation.*

/**
 * 商品阶梯价格
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@RestController
@RequestMapping("coupon/skuladder")
class SkuLadderController(
    val skuLadderService: SkuLadderService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:skuladder:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = skuLadderService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:skuladder:info")
    fun info(@PathVariable("id") id: Long): R {
        val skuLadder: SkuLadderEntity = skuLadderService.getById(id)

        return R.ok().put("skuLadder", skuLadder)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:skuladder:save")
    fun save(@RequestBody skuLadder: SkuLadderEntity): R {
        skuLadderService.save(skuLadder)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:skuladder:update")
    fun update(@RequestBody skuLadder: SkuLadderEntity): R {
        skuLadderService.updateById(skuLadder)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:skuladder:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        skuLadderService.removeByIds(listOf(ids))

        return R.ok()
    }

}
