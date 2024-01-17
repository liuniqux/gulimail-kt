package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.SpuCommentDao
import com.atguigu.gulimail.product.entity.SpuCommentEntity
import com.atguigu.gulimail.product.service.SpuCommentService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("spuCommentService")
class SpuCommentServiceImpl : ServiceImpl<SpuCommentDao, SpuCommentEntity>(), SpuCommentService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SpuCommentEntity> = this.page(
            Query<SpuCommentEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}