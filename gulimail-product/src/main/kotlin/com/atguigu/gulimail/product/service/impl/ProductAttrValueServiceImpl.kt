package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.ProductAttrValueDao
import com.atguigu.gulimail.product.entity.ProductAttrValueEntity
import com.atguigu.gulimail.product.service.ProductAttrValueService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("productAttrValueService")
class ProductAttrValueServiceImpl : ServiceImpl<ProductAttrValueDao, ProductAttrValueEntity>(),
    ProductAttrValueService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<ProductAttrValueEntity> = this.page(
            Query<ProductAttrValueEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}