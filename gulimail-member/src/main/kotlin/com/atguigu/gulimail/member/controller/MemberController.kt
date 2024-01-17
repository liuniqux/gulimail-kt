package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.MemberEntity
import com.atguigu.gulimail.member.service.MemberService
import org.springframework.web.bind.annotation.*

/**
 * 会员
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/member")
class MemberController(
    val memberService: MemberService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:member:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = memberService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:member:info")
    fun info(@PathVariable("id") id: Long): R {
        val member: MemberEntity = memberService.getById(id)

        return R.ok().put("member", member)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:member:save")
    fun save(@RequestBody member: MemberEntity): R {
        memberService.save(member)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:member:update")
    fun update(@RequestBody member: MemberEntity): R {
        memberService.updateById(member)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:member:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        memberService.removeByIds(listOf(ids))

        return R.ok()
    }

}
