package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.SeckillSkuRelationEntity
import com.atguigu.gulimail.coupon.service.SeckillSkuRelationService
import org.springframework.web.bind.annotation.*

/**
 * 秒杀活动商品关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@RestController
@RequestMapping("coupon/seckillskurelation")
class SeckillSkuRelationController(
    val seckillSkuRelationService: SeckillSkuRelationService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:seckillskurelation:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = seckillSkuRelationService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:seckillskurelation:info")
    fun info(@PathVariable("id") id: Long): R {
        val seckillSkuRelation: SeckillSkuRelationEntity = seckillSkuRelationService.getById(id)

        return R.ok().put("seckillSkuRelation", seckillSkuRelation)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:seckillskurelation:save")
    fun save(@RequestBody seckillSkuRelation: SeckillSkuRelationEntity): R {
        seckillSkuRelationService.save(seckillSkuRelation)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:seckillskurelation:update")
    fun update(@RequestBody seckillSkuRelation: SeckillSkuRelationEntity): R {
        seckillSkuRelationService.updateById(seckillSkuRelation)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:seckillskurelation:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        seckillSkuRelationService.removeByIds(listOf(ids))

        return R.ok()
    }

}
