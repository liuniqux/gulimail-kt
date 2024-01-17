package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.HomeSubjectEntity
import com.atguigu.gulimail.coupon.service.HomeSubjectService
import org.springframework.web.bind.annotation.*

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/homesubject")
class HomeSubjectController(
    val homeSubjectService: HomeSubjectService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:homesubject:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = homeSubjectService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:homesubject:info")
    fun info(@PathVariable("id") id: Long): R {
        val homeSubject: HomeSubjectEntity = homeSubjectService.getById(id)

        return R.ok().put("homeSubject", homeSubject)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:homesubject:save")
    fun save(@RequestBody homeSubject: HomeSubjectEntity): R {
        homeSubjectService.save(homeSubject)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:homesubject:update")
    fun update(@RequestBody homeSubject: HomeSubjectEntity): R {
        homeSubjectService.updateById(homeSubject)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:homesubject:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        homeSubjectService.removeByIds(listOf(ids))

        return R.ok()
    }

}
