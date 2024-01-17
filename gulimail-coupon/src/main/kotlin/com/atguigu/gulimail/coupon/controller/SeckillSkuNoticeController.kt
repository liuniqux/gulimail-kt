package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.SeckillSkuNoticeEntity
import com.atguigu.gulimail.coupon.service.SeckillSkuNoticeService
import org.springframework.web.bind.annotation.*

/**
 * 秒杀商品通知订阅
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
@RestController
@RequestMapping("coupon/seckillskunotice")
class SeckillSkuNoticeController(
    val seckillSkuNoticeService: SeckillSkuNoticeService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:seckillskunotice:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = seckillSkuNoticeService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:seckillskunotice:info")
    fun info(@PathVariable("id") id: Long): R {
        val seckillSkuNotice: SeckillSkuNoticeEntity = seckillSkuNoticeService.getById(id)

        return R.ok().put("seckillSkuNotice", seckillSkuNotice)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:seckillskunotice:save")
    fun save(@RequestBody seckillSkuNotice: SeckillSkuNoticeEntity): R {
        seckillSkuNoticeService.save(seckillSkuNotice)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:seckillskunotice:update")
    fun update(@RequestBody seckillSkuNotice: SeckillSkuNoticeEntity): R {
        seckillSkuNoticeService.updateById(seckillSkuNotice)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:seckillskunotice:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        seckillSkuNoticeService.removeByIds(listOf(ids))

        return R.ok()
    }

}
