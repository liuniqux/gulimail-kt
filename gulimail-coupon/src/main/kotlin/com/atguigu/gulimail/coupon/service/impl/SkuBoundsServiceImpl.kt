package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.SkuBoundsDao
import com.atguigu.gulimail.coupon.entity.SkuBoundsEntity
import com.atguigu.gulimail.coupon.service.SkuBoundsService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("skuBoundsService")
class SkuBoundsServiceImpl : ServiceImpl<SkuBoundsDao, SkuBoundsEntity>(), SkuBoundsService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SkuBoundsEntity> = this.page(
            Query<SkuBoundsEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}