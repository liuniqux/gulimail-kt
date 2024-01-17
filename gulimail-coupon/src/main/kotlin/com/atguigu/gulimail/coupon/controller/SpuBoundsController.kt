package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.SpuBoundsEntity
import com.atguigu.gulimail.coupon.service.SpuBoundsService
import org.springframework.web.bind.annotation.*

/**
 * 商品spu积分设置
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@RestController
@RequestMapping("coupon/spubounds")
class SpuBoundsController(
    val spuBoundsService: SpuBoundsService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:spubounds:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = spuBoundsService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:spubounds:info")
    fun info(@PathVariable("id") id: Long): R {
        val spuBounds: SpuBoundsEntity = spuBoundsService.getById(id)

        return R.ok().put("spuBounds", spuBounds)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:spubounds:save")
    fun save(@RequestBody spuBounds: SpuBoundsEntity): R {
        spuBoundsService.save(spuBounds)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:spubounds:update")
    fun update(@RequestBody spuBounds: SpuBoundsEntity): R {
        spuBoundsService.updateById(spuBounds)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:spubounds:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        spuBoundsService.removeByIds(listOf(ids))

        return R.ok()
    }

}
