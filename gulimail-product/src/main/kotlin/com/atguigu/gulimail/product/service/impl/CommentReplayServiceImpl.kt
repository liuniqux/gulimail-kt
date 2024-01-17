package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.CommentReplayDao
import com.atguigu.gulimail.product.entity.CommentReplayEntity
import com.atguigu.gulimail.product.service.CommentReplayService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("commentReplayService")
class CommentReplayServiceImpl : ServiceImpl<CommentReplayDao, CommentReplayEntity>(), CommentReplayService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<CommentReplayEntity> = this.page(
            Query<CommentReplayEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}