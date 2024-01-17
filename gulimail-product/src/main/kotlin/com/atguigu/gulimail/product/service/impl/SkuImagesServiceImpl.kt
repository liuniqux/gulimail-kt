package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.SkuImagesDao
import com.atguigu.gulimail.product.entity.SkuImagesEntity
import com.atguigu.gulimail.product.service.SkuImagesService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("skuImagesService")
class SkuImagesServiceImpl : ServiceImpl<SkuImagesDao, SkuImagesEntity>(), SkuImagesService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SkuImagesEntity> = this.page(
            Query<SkuImagesEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}