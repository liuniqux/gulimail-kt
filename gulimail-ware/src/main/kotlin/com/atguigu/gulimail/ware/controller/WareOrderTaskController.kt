package com.atguigu.gulimail.ware.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.ware.entity.WareOrderTaskEntity
import com.atguigu.gulimail.ware.service.WareOrderTaskService
import org.springframework.web.bind.annotation.*

/**
 * 库存工作单
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@RestController
@RequestMapping("ware/wareordertask")
class WareOrderTaskController(
    val wareOrderTaskService: WareOrderTaskService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("ware:wareordertask:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = wareOrderTaskService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("ware:wareordertask:info")
    fun info(@PathVariable("id") id: Long): R {
        val wareOrderTask: WareOrderTaskEntity = wareOrderTaskService.getById(id)

        return R.ok().put("wareOrderTask", wareOrderTask)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("ware:wareordertask:save")
    fun save(@RequestBody wareOrderTask: WareOrderTaskEntity): R {
        wareOrderTaskService.save(wareOrderTask)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("ware:wareordertask:update")
    fun update(@RequestBody wareOrderTask: WareOrderTaskEntity): R {
        wareOrderTaskService.updateById(wareOrderTask)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("ware:wareordertask:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        wareOrderTaskService.removeByIds(listOf(ids))

        return R.ok()
    }

}
