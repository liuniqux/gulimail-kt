package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.HomeSubjectSpuEntity
import com.atguigu.gulimail.coupon.service.HomeSubjectSpuService
import org.springframework.web.bind.annotation.*

/**
 * 专题商品
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/homesubjectspu")
class HomeSubjectSpuController(
    val homeSubjectSpuService: HomeSubjectSpuService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:homesubjectspu:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = homeSubjectSpuService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:homesubjectspu:info")
    fun info(@PathVariable("id") id: Long): R {
        val homeSubjectSpu: HomeSubjectSpuEntity = homeSubjectSpuService.getById(id)

        return R.ok().put("homeSubjectSpu", homeSubjectSpu)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:homesubjectspu:save")
    fun save(@RequestBody homeSubjectSpu: HomeSubjectSpuEntity): R {
        homeSubjectSpuService.save(homeSubjectSpu)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:homesubjectspu:update")
    fun update(@RequestBody homeSubjectSpu: HomeSubjectSpuEntity): R {
        homeSubjectSpuService.updateById(homeSubjectSpu)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:homesubjectspu:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        homeSubjectSpuService.removeByIds(listOf(ids))

        return R.ok()
    }

}
