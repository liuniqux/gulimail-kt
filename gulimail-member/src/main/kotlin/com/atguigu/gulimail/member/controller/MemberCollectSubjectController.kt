package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.MemberCollectSubjectEntity
import com.atguigu.gulimail.member.service.MemberCollectSubjectService
import org.springframework.web.bind.annotation.*

/**
 * 会员收藏的专题活动
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/membercollectsubject")
class MemberCollectSubjectController(
    val memberCollectSubjectService: MemberCollectSubjectService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:membercollectsubject:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = memberCollectSubjectService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:membercollectsubject:info")
    fun info(@PathVariable("id") id: Long): R {
        val memberCollectSubject: MemberCollectSubjectEntity = memberCollectSubjectService.getById(id)

        return R.ok().put("memberCollectSubject", memberCollectSubject)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:membercollectsubject:save")
    fun save(@RequestBody memberCollectSubject: MemberCollectSubjectEntity): R {
        memberCollectSubjectService.save(memberCollectSubject)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:membercollectsubject:update")
    fun update(@RequestBody memberCollectSubject: MemberCollectSubjectEntity): R {
        memberCollectSubjectService.updateById(memberCollectSubject)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:membercollectsubject:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        memberCollectSubjectService.removeByIds(listOf(ids))

        return R.ok()
    }

}
