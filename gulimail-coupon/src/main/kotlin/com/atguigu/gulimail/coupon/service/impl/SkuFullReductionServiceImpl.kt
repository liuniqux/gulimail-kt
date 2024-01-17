package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.SkuFullReductionDao
import com.atguigu.gulimail.coupon.entity.SkuFullReductionEntity
import com.atguigu.gulimail.coupon.service.SkuFullReductionService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("skuFullReductionService")
class SkuFullReductionServiceImpl : ServiceImpl<SkuFullReductionDao, SkuFullReductionEntity>(),
    SkuFullReductionService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SkuFullReductionEntity> = this.page(
            Query<SkuFullReductionEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}