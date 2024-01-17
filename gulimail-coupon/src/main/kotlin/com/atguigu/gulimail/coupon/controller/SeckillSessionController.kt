package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.SeckillSessionEntity
import com.atguigu.gulimail.coupon.service.SeckillSessionService
import org.springframework.web.bind.annotation.*

/**
 * 秒杀活动场次
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/seckillsession")
class SeckillSessionController(
    val seckillSessionService: SeckillSessionService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:seckillsession:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = seckillSessionService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:seckillsession:info")
    fun info(@PathVariable("id") id: Long): R {
        val seckillSession: SeckillSessionEntity = seckillSessionService.getById(id)

        return R.ok().put("seckillSession", seckillSession)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:seckillsession:save")
    fun save(@RequestBody seckillSession: SeckillSessionEntity): R {
        seckillSessionService.save(seckillSession)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:seckillsession:update")
    fun update(@RequestBody seckillSession: SeckillSessionEntity): R {
        seckillSessionService.updateById(seckillSession)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:seckillsession:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        seckillSessionService.removeByIds(listOf(ids))

        return R.ok()
    }

}
