package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.MemberCollectSpuEntity
import com.atguigu.gulimail.member.service.MemberCollectSpuService
import org.springframework.web.bind.annotation.*

/**
 * 会员收藏的商品
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/membercollectspu")
class MemberCollectSpuController(
    val memberCollectSpuService: MemberCollectSpuService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:membercollectspu:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = memberCollectSpuService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:membercollectspu:info")
    fun info(@PathVariable("id") id: Long): R {
        val memberCollectSpu: MemberCollectSpuEntity = memberCollectSpuService.getById(id)

        return R.ok().put("memberCollectSpu", memberCollectSpu)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:membercollectspu:save")
    fun save(@RequestBody memberCollectSpu: MemberCollectSpuEntity): R {
        memberCollectSpuService.save(memberCollectSpu)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:membercollectspu:update")
    fun update(@RequestBody memberCollectSpu: MemberCollectSpuEntity): R {
        memberCollectSpuService.updateById(memberCollectSpu)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:membercollectspu:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        memberCollectSpuService.removeByIds(listOf(ids))

        return R.ok()
    }

}
