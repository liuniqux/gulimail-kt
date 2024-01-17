package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.SpuInfoEntity
import com.atguigu.gulimail.product.service.SpuInfoService
import org.springframework.web.bind.annotation.*


/**
 * spu信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/spuinfo")
class SpuInfoController(private val spuInfoService: SpuInfoService) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:spuinfo:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = spuInfoService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:spuinfo:info")
    fun info(@PathVariable("id") id: Long): R {
        val spuInfo: SpuInfoEntity = spuInfoService.getById(id)
        return R.ok().put("spuInfo", spuInfo)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:spuinfo:save")
    fun save(@RequestBody spuInfo: SpuInfoEntity): R {
        spuInfoService.save(spuInfo)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:spuinfo:update")
    fun update(@RequestBody spuInfo: SpuInfoEntity): R {
        spuInfoService.updateById(spuInfo)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:spuinfo:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        spuInfoService.removeByIds(listOf(ids))
        return R.ok()
    }
}
