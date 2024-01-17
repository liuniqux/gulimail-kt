package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.SpuBoundsDao
import com.atguigu.gulimail.coupon.entity.SpuBoundsEntity
import com.atguigu.gulimail.coupon.service.SpuBoundsService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("spuBoundsService")
class SpuBoundsServiceImpl : ServiceImpl<SpuBoundsDao, SpuBoundsEntity>(), SpuBoundsService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SpuBoundsEntity> = this.page(
            Query<SpuBoundsEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}