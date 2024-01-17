package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.SkuSaleAttrValueDao
import com.atguigu.gulimail.product.entity.SkuSaleAttrValueEntity
import com.atguigu.gulimail.product.service.SkuSaleAttrValueService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("skuSaleAttrValueService")
class SkuSaleAttrValueServiceImpl : ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity>(),
    SkuSaleAttrValueService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SkuSaleAttrValueEntity> = this.page(
            Query<SkuSaleAttrValueEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}