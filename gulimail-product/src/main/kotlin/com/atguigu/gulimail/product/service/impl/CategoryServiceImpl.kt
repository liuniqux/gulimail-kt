package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.CategoryDao
import com.atguigu.gulimail.product.entity.CategoryEntity
import com.atguigu.gulimail.product.service.CategoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("categoryService")
class CategoryServiceImpl : ServiceImpl<CategoryDao, CategoryEntity>(), CategoryService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<CategoryEntity> = this.page(
            Query<CategoryEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}