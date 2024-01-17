package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.AttrGroupEntity
import com.atguigu.gulimail.product.service.AttrGroupService
import org.springframework.web.bind.annotation.*


/**
 * 属性分组
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/attrgroup")
class AttrGroupController(
    private val attrGroupService: AttrGroupService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:attrgroup:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = attrGroupService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
    // @RequiresPermissions("product:attrgroup:info")
    fun info(@PathVariable("attrGroupId") attrGroupId: Long): R {
        val attrGroup: AttrGroupEntity = attrGroupService.getById(attrGroupId)

        return R.ok().put("attrGroup", attrGroup)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:attrgroup:save")
    fun save(@RequestBody attrGroup: AttrGroupEntity): R {
        attrGroupService.save(attrGroup)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:attrgroup:update")
    fun update(@RequestBody attrGroup: AttrGroupEntity): R {
        attrGroupService.updateById(attrGroup)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:attrgroup:delete")
    fun delete(@RequestBody attrGroupIds: Array<Long>): R {
        attrGroupService.removeByIds(listOf(attrGroupIds))

        return R.ok()
    }
}
