package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.CouponSpuRelationEntity
import com.atguigu.gulimail.coupon.service.CouponSpuRelationService
import org.springframework.web.bind.annotation.*

/**
 * 优惠券与产品关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/couponspurelation")
class CouponSpuRelationController(
    val couponSpuRelationService: CouponSpuRelationService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:couponspurelation:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = couponSpuRelationService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:couponspurelation:info")
    fun info(@PathVariable("id") id: Long): R {
        val couponSpuRelation: CouponSpuRelationEntity = couponSpuRelationService.getById(id)

        return R.ok().put("couponSpuRelation", couponSpuRelation)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:couponspurelation:save")
    fun save(@RequestBody couponSpuRelation: CouponSpuRelationEntity): R {
        couponSpuRelationService.save(couponSpuRelation)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:couponspurelation:update")
    fun update(@RequestBody couponSpuRelation: CouponSpuRelationEntity): R {
        couponSpuRelationService.updateById(couponSpuRelation)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:couponspurelation:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        couponSpuRelationService.removeByIds(listOf(ids))

        return R.ok()
    }

}
