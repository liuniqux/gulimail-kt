package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.SeckillPromotionEntity
import com.atguigu.gulimail.coupon.service.SeckillPromotionService
import org.springframework.web.bind.annotation.*

/**
 * 秒杀活动
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/seckillpromotion")
class SeckillPromotionController(
    val seckillPromotionService: SeckillPromotionService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:seckillpromotion:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = seckillPromotionService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:seckillpromotion:info")
    fun info(@PathVariable("id") id: Long): R {
        val seckillPromotion: SeckillPromotionEntity = seckillPromotionService.getById(id)

        return R.ok().put("seckillPromotion", seckillPromotion)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:seckillpromotion:save")
    fun save(@RequestBody seckillPromotion: SeckillPromotionEntity): R {
        seckillPromotionService.save(seckillPromotion)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:seckillpromotion:update")
    fun update(@RequestBody seckillPromotion: SeckillPromotionEntity): R {
        seckillPromotionService.updateById(seckillPromotion)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:seckillpromotion:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        seckillPromotionService.removeByIds(listOf(ids))

        return R.ok()
    }

}
