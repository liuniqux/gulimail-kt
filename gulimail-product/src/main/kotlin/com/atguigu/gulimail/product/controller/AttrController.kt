package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.AttrEntity
import com.atguigu.gulimail.product.service.AttrService
import org.springframework.web.bind.annotation.*


/**
 * 商品属性
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/attr")
class AttrController(
    private val attrService: AttrService
) {


    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:attr:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = attrService.queryPage(params)

        return R.ok().put("page", page)
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    // @RequiresPermissions("product:attr:info")
    fun info(@PathVariable("attrId") attrId: Long): R {
        val attr: AttrEntity = attrService.getById(attrId)

        return R.ok().put("attr", attr)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:attr:save")
    fun save(@RequestBody attr: AttrEntity): R {
        attrService.save(attr)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:attr:update")
    fun update(@RequestBody attr: AttrEntity): R {
        attrService.updateById(attr)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:attr:delete")
    fun delete(@RequestBody attrIds: Array<Long>): R {
        attrService.removeByIds(listOf(attrIds))

        return R.ok()
    }

}
