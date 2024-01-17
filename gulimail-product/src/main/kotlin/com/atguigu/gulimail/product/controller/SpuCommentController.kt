package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.SpuCommentEntity
import com.atguigu.gulimail.product.service.SpuCommentService
import org.springframework.web.bind.annotation.*


/**
 * 商品评价
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/spucomment")
class SpuCommentController(private val spuCommentService: SpuCommentService) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:spucomment:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = spuCommentService.queryPage(params)
        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:spucomment:info")
    fun info(@PathVariable("id") id: Long): R {
        val spuComment: SpuCommentEntity = spuCommentService.getById(id)
        return R.ok().put("spuComment", spuComment)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:spucomment:save")
    fun save(@RequestBody spuComment: SpuCommentEntity): R {
        spuCommentService.save(spuComment)
        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:spucomment:update")
    fun update(@RequestBody spuComment: SpuCommentEntity): R {
        spuCommentService.updateById(spuComment)
        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:spucomment:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        spuCommentService.removeByIds(listOf(ids))
        return R.ok()
    }
}
