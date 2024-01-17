package com.atguigu.gulimail.ware.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.ware.entity.WareOrderTaskDetailEntity
import com.atguigu.gulimail.ware.service.WareOrderTaskDetailService
import org.springframework.web.bind.annotation.*

/**
 * 库存工作单
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@RestController
@RequestMapping("ware/wareordertaskdetail")
class WareOrderTaskDetailController(
    val wareOrderTaskDetailService: WareOrderTaskDetailService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("ware:wareordertaskdetail:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = wareOrderTaskDetailService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("ware:wareordertaskdetail:info")
    fun info(@PathVariable("id") id: Long): R {
        val wareOrderTaskDetail: WareOrderTaskDetailEntity = wareOrderTaskDetailService.getById(id)

        return R.ok().put("wareOrderTaskDetail", wareOrderTaskDetail)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("ware:wareordertaskdetail:save")
    fun save(@RequestBody wareOrderTaskDetail: WareOrderTaskDetailEntity): R {
        wareOrderTaskDetailService.save(wareOrderTaskDetail)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("ware:wareordertaskdetail:update")
    fun update(@RequestBody wareOrderTaskDetail: WareOrderTaskDetailEntity): R {
        wareOrderTaskDetailService.updateById(wareOrderTaskDetail)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("ware:wareordertaskdetail:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        wareOrderTaskDetailService.removeByIds(listOf(ids))

        return R.ok()
    }

}
