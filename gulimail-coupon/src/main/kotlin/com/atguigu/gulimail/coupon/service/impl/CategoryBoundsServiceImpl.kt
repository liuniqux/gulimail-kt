package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.CategoryBoundsDao
import com.atguigu.gulimail.coupon.entity.CategoryBoundsEntity
import com.atguigu.gulimail.coupon.service.CategoryBoundsService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("categoryBoundsService")
class CategoryBoundsServiceImpl : ServiceImpl<CategoryBoundsDao, CategoryBoundsEntity>(), CategoryBoundsService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<CategoryBoundsEntity> = this.page(
            Query<CategoryBoundsEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}