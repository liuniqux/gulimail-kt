package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.MemberLevelEntity
import com.atguigu.gulimail.member.service.MemberLevelService
import org.springframework.web.bind.annotation.*

/**
 * 会员等级
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/memberlevel")
class MemberLevelController(
    val memberLevelService: MemberLevelService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:memberlevel:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = memberLevelService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:memberlevel:info")
    fun info(@PathVariable("id") id: Long): R {
        val memberLevel: MemberLevelEntity = memberLevelService.getById(id)

        return R.ok().put("memberLevel", memberLevel)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:memberlevel:save")
    fun save(@RequestBody memberLevel: MemberLevelEntity): R {
        memberLevelService.save(memberLevel)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:memberlevel:update")
    fun update(@RequestBody memberLevel: MemberLevelEntity): R {
        memberLevelService.updateById(memberLevel)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:memberlevel:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        memberLevelService.removeByIds(listOf(ids))

        return R.ok()
    }

}
