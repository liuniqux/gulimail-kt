package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.GrowthChangeHistoryEntity
import com.atguigu.gulimail.member.service.GrowthChangeHistoryService
import org.springframework.web.bind.annotation.*

/**
 * 成长值变化历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/growthchangehistory")
class GrowthChangeHistoryController(
    val growthChangeHistoryService: GrowthChangeHistoryService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:growthchangehistory:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = growthChangeHistoryService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:growthchangehistory:info")
    fun info(@PathVariable("id") id: Long): R {
        val growthChangeHistory: GrowthChangeHistoryEntity = growthChangeHistoryService.getById(id)

        return R.ok().put("growthChangeHistory", growthChangeHistory)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:growthchangehistory:save")
    fun save(@RequestBody growthChangeHistory: GrowthChangeHistoryEntity): R {
        growthChangeHistoryService.save(growthChangeHistory)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:growthchangehistory:update")
    fun update(@RequestBody growthChangeHistory: GrowthChangeHistoryEntity): R {
        growthChangeHistoryService.updateById(growthChangeHistory)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:growthchangehistory:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        growthChangeHistoryService.removeByIds(listOf(ids))

        return R.ok()
    }

}
