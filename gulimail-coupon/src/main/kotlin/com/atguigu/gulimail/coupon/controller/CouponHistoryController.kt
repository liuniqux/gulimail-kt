package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.CouponHistoryEntity
import com.atguigu.gulimail.coupon.service.CouponHistoryService
import org.springframework.web.bind.annotation.*

/**
 * 优惠券领取历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/couponhistory")
class CouponHistoryController(
    val couponHistoryService: CouponHistoryService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:couponhistory:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = couponHistoryService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:couponhistory:info")
    fun info(@PathVariable("id") id: Long): R {
        val couponHistory: CouponHistoryEntity = couponHistoryService.getById(id)

        return R.ok().put("couponHistory", couponHistory)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:couponhistory:save")
    fun save(@RequestBody couponHistory: CouponHistoryEntity): R {
        couponHistoryService.save(couponHistory)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:couponhistory:update")
    fun update(@RequestBody couponHistory: CouponHistoryEntity): R {
        couponHistoryService.updateById(couponHistory)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:couponhistory:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        couponHistoryService.removeByIds(listOf(ids))

        return R.ok()
    }

}
