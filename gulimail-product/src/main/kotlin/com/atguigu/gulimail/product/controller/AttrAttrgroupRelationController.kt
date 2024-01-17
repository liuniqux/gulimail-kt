package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.AttrAttrgroupRelationEntity
import com.atguigu.gulimail.product.service.AttrAttrgroupRelationService
import org.springframework.web.bind.annotation.*


/**
 * 属性&属性分组关联
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/attrattrgrouprelation")
class AttrAttrgroupRelationController(
    private val attrAttrgroupRelationService: AttrAttrgroupRelationService
) {


    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:attrattrgrouprelation:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = attrAttrgroupRelationService.queryPage(params)

        return R.ok().put("page", page)
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:attrattrgrouprelation:info")
    fun info(@PathVariable("id") id: Long): R {
        val attrAttrgroupRelation: AttrAttrgroupRelationEntity = attrAttrgroupRelationService.getById(id)

        return R.ok().put("attrAttrgroupRelation", attrAttrgroupRelation)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:attrattrgrouprelation:save")
    fun save(@RequestBody attrAttrgroupRelation: AttrAttrgroupRelationEntity): R {
        attrAttrgroupRelationService.save(attrAttrgroupRelation)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:attrattrgrouprelation:update")
    fun update(@RequestBody attrAttrgroupRelation: AttrAttrgroupRelationEntity): R {
        attrAttrgroupRelationService.updateById(attrAttrgroupRelation)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:attrattrgrouprelation:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        attrAttrgroupRelationService.removeByIds(listOf(ids))

        return R.ok()
    }

}
