package com.atguigu.gulimail.ware.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.ware.entity.WareInfoEntity
import com.atguigu.gulimail.ware.service.WareInfoService
import org.springframework.web.bind.annotation.*

/**
 * 仓库信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:24:06
 */
@RestController
@RequestMapping("ware/wareinfo")
class WareInfoController(
    val wareInfoService: WareInfoService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("ware:wareinfo:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = wareInfoService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("ware:wareinfo:info")
    fun info(@PathVariable("id") id: Long): R {
        val wareInfo: WareInfoEntity = wareInfoService.getById(id)

        return R.ok().put("wareInfo", wareInfo)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("ware:wareinfo:save")
    fun save(@RequestBody wareInfo: WareInfoEntity): R {
        wareInfoService.save(wareInfo)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("ware:wareinfo:update")
    fun update(@RequestBody wareInfo: WareInfoEntity): R {
        wareInfoService.updateById(wareInfo)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("ware:wareinfo:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        wareInfoService.removeByIds(listOf(ids))

        return R.ok()
    }

}
