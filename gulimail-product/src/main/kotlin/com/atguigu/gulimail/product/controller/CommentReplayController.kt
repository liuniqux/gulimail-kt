package com.atguigu.gulimail.product.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.product.entity.CommentReplayEntity
import com.atguigu.gulimail.product.service.CommentReplayService
import org.springframework.web.bind.annotation.*


/**
 * 商品评价回复关系
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-10 21:28:11
 */
@RestController
@RequestMapping("product/commentreplay")
class CommentReplayController(
    private val commentReplayService: CommentReplayService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:commentreplay:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = commentReplayService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:commentreplay:info")
    fun info(@PathVariable("id") id: Long): R {
        val commentReplay: CommentReplayEntity = commentReplayService.getById(id)

        return R.ok().put("commentReplay", commentReplay)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:commentreplay:save")
    fun save(@RequestBody commentReplay: CommentReplayEntity): R {
        commentReplayService.save(commentReplay)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:commentreplay:update")
    fun update(@RequestBody commentReplay: CommentReplayEntity): R {
        commentReplayService.updateById(commentReplay)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:commentreplay:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        commentReplayService.removeByIds(listOf(ids))

        return R.ok()
    }
}
