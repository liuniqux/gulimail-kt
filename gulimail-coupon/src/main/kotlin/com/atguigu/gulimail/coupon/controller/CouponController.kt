package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.CouponEntity
import com.atguigu.gulimail.coupon.service.CouponService
import org.springframework.web.bind.annotation.*

/**
 * 优惠券信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/coupon")
class CouponController(
    val couponService: CouponService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:coupon:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = couponService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:coupon:info")
    fun info(@PathVariable("id") id: Long): R {
        val coupon: CouponEntity = couponService.getById(id)

        return R.ok().put("coupon", coupon)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:coupon:save")
    fun save(@RequestBody coupon: CouponEntity): R {
        couponService.save(coupon)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:coupon:update")
    fun update(@RequestBody coupon: CouponEntity): R {
        couponService.updateById(coupon)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:coupon:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        couponService.removeByIds(listOf(ids))

        return R.ok()
    }

}
