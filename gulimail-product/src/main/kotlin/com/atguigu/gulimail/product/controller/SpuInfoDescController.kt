package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.SpuInfoDescEntity
import com.atguigu.gulimail.product.service.SpuInfoDescService
import org.springframework.web.bind.annotation.*


/**
 * spu信息介绍
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/spuinfodesc")
class SpuInfoDescController(private val spuInfoDescService: SpuInfoDescService) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:spuinfodesc:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = spuInfoDescService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    // @RequiresPermissions("product:spuinfodesc:info")
    fun info(@PathVariable("spuId") spuId: Long): R {
        val spuInfoDesc: SpuInfoDescEntity = spuInfoDescService.getById(spuId)
        return R.ok().put("spuInfoDesc", spuInfoDesc)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:spuinfodesc:save")
    fun save(@RequestBody spuInfoDesc: SpuInfoDescEntity): R {
        spuInfoDescService.save(spuInfoDesc)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:spuinfodesc:update")
    fun update(@RequestBody spuInfoDesc: SpuInfoDescEntity): R {
        spuInfoDescService.updateById(spuInfoDesc)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:spuinfodesc:delete")
    fun delete(@RequestBody spuIds: Array<Long>): R {
        spuInfoDescService.removeByIds(listOf(spuIds))
        return R.ok()
    }
}
