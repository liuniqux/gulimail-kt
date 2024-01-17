package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.IntegrationChangeHistoryEntity
import com.atguigu.gulimail.member.service.IntegrationChangeHistoryService
import org.springframework.web.bind.annotation.*

/**
 * 积分变化历史记录
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/integrationchangehistory")
class IntegrationChangeHistoryController(
    val integrationChangeHistoryService: IntegrationChangeHistoryService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:integrationchangehistory:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = integrationChangeHistoryService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:integrationchangehistory:info")
    fun info(@PathVariable("id") id: Long): R {
        val integrationChangeHistory: IntegrationChangeHistoryEntity = integrationChangeHistoryService.getById(id)

        return R.ok().put("integrationChangeHistory", integrationChangeHistory)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:integrationchangehistory:save")
    fun save(@RequestBody integrationChangeHistory: IntegrationChangeHistoryEntity): R {
        integrationChangeHistoryService.save(integrationChangeHistory)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:integrationchangehistory:update")
    fun update(@RequestBody integrationChangeHistory: IntegrationChangeHistoryEntity): R {
        integrationChangeHistoryService.updateById(integrationChangeHistory)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:integrationchangehistory:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        integrationChangeHistoryService.removeByIds(listOf(ids))

        return R.ok()
    }

}
