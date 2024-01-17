package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.SpuImagesDao
import com.atguigu.gulimail.product.entity.SpuImagesEntity
import com.atguigu.gulimail.product.service.SpuImagesService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("spuImagesService")
class SpuImagesServiceImpl : ServiceImpl<SpuImagesDao, SpuImagesEntity>(), SpuImagesService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SpuImagesEntity> = this.page(
            Query<SpuImagesEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}