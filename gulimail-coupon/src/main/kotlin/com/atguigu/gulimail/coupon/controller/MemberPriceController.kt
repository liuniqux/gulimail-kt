package com.atguigu.gulimail.coupon.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.coupon.entity.MemberPriceEntity
import com.atguigu.gulimail.coupon.service.MemberPriceService
import org.springframework.web.bind.annotation.*

/**
 * 商品会员价格
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:41
 */
@RestController
@RequestMapping("coupon/memberprice")
class MemberPriceController(
    val memberPriceService: MemberPriceService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:memberprice:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = memberPriceService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:memberprice:info")
    fun info(@PathVariable("id") id: Long): R {
        val memberPrice: MemberPriceEntity = memberPriceService.getById(id)

        return R.ok().put("memberPrice", memberPrice)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:memberprice:save")
    fun save(@RequestBody memberPrice: MemberPriceEntity): R {
        memberPriceService.save(memberPrice)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:memberprice:update")
    fun update(@RequestBody memberPrice: MemberPriceEntity): R {
        memberPriceService.updateById(memberPrice)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:memberprice:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        memberPriceService.removeByIds(listOf(ids))

        return R.ok()
    }

}
