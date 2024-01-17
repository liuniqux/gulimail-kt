package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.CouponSpuCategoryRelationEntity
import com.atguigu.gulimail.coupon.service.CouponSpuCategoryRelationService
import org.springframework.web.bind.annotation.*

/**
 * 优惠券分类关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/couponspucategoryrelation")
class CouponSpuCategoryRelationController(
    val couponSpuCategoryRelationService: CouponSpuCategoryRelationService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:couponspucategoryrelation:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = couponSpuCategoryRelationService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:couponspucategoryrelation:info")
    fun info(@PathVariable("id") id: Long): R {
        val couponSpuCategoryRelation: CouponSpuCategoryRelationEntity = couponSpuCategoryRelationService.getById(id)

        return R.ok().put("couponSpuCategoryRelation", couponSpuCategoryRelation)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:couponspucategoryrelation:save")
    fun save(@RequestBody couponSpuCategoryRelation: CouponSpuCategoryRelationEntity): R {
        couponSpuCategoryRelationService.save(couponSpuCategoryRelation)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:couponspucategoryrelation:update")
    fun update(@RequestBody couponSpuCategoryRelation: CouponSpuCategoryRelationEntity): R {
        couponSpuCategoryRelationService.updateById(couponSpuCategoryRelation)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:couponspucategoryrelation:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        couponSpuCategoryRelationService.removeByIds(listOf(ids))

        return R.ok()
    }

}
