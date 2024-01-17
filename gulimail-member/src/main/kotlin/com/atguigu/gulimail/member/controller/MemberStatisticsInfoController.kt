package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.MemberStatisticsInfoEntity
import com.atguigu.gulimail.member.service.MemberStatisticsInfoService
import org.springframework.web.bind.annotation.*

/**
 * 会员统计信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/memberstatisticsinfo")
class MemberStatisticsInfoController(
    val memberStatisticsInfoService: MemberStatisticsInfoService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:memberstatisticsinfo:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = memberStatisticsInfoService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:memberstatisticsinfo:info")
    fun info(@PathVariable("id") id: Long): R {
        val memberStatisticsInfo: MemberStatisticsInfoEntity = memberStatisticsInfoService.getById(id)

        return R.ok().put("memberStatisticsInfo", memberStatisticsInfo)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:memberstatisticsinfo:save")
    fun save(@RequestBody memberStatisticsInfo: MemberStatisticsInfoEntity): R {
        memberStatisticsInfoService.save(memberStatisticsInfo)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:memberstatisticsinfo:update")
    fun update(@RequestBody memberStatisticsInfo: MemberStatisticsInfoEntity): R {
        memberStatisticsInfoService.updateById(memberStatisticsInfo)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:memberstatisticsinfo:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        memberStatisticsInfoService.removeByIds(listOf(ids))

        return R.ok()
    }

}
