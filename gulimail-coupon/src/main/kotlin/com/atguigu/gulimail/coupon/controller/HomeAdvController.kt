package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.HomeAdvEntity
import com.atguigu.gulimail.coupon.service.HomeAdvService
import org.springframework.web.bind.annotation.*

/**
 * 首页轮播广告
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/homeadv")
class HomeAdvController(
    val homeAdvService: HomeAdvService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:homeadv:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = homeAdvService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:homeadv:info")
    fun info(@PathVariable("id") id: Long): R {
        val homeAdv: HomeAdvEntity = homeAdvService.getById(id)

        return R.ok().put("homeAdv", homeAdv)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:homeadv:save")
    fun save(@RequestBody homeAdv: HomeAdvEntity): R {
        homeAdvService.save(homeAdv)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:homeadv:update")
    fun update(@RequestBody homeAdv: HomeAdvEntity): R {
        homeAdvService.updateById(homeAdv)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:homeadv:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        homeAdvService.removeByIds(listOf(ids))

        return R.ok()
    }

}
