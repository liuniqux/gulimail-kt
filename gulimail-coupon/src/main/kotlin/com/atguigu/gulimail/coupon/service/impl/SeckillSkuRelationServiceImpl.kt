package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.SeckillSkuRelationDao
import com.atguigu.gulimail.coupon.entity.SeckillSkuRelationEntity
import com.atguigu.gulimail.coupon.service.SeckillSkuRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("seckillSkuRelationService")
class SeckillSkuRelationServiceImpl : ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity>(),
    SeckillSkuRelationService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SeckillSkuRelationEntity> = this.page(
            Query<SeckillSkuRelationEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}