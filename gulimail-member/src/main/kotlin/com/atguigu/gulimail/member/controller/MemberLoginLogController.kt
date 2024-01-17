package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.MemberLoginLogEntity
import com.atguigu.gulimail.member.service.MemberLoginLogService
import org.springframework.web.bind.annotation.*

/**
 * 会员登录记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/memberloginlog")
class MemberLoginLogController(
    val memberLoginLogService: MemberLoginLogService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:memberloginlog:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = memberLoginLogService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:memberloginlog:info")
    fun info(@PathVariable("id") id: Long): R {
        val memberLoginLog: MemberLoginLogEntity = memberLoginLogService.getById(id)

        return R.ok().put("memberLoginLog", memberLoginLog)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:memberloginlog:save")
    fun save(@RequestBody memberLoginLog: MemberLoginLogEntity): R {
        memberLoginLogService.save(memberLoginLog)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:memberloginlog:update")
    fun update(@RequestBody memberLoginLog: MemberLoginLogEntity): R {
        memberLoginLogService.updateById(memberLoginLog)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:memberloginlog:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        memberLoginLogService.removeByIds(listOf(ids))

        return R.ok()
    }

}
