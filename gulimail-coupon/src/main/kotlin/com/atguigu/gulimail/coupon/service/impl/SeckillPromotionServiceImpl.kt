package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.SeckillPromotionDao
import com.atguigu.gulimail.coupon.entity.SeckillPromotionEntity
import com.atguigu.gulimail.coupon.service.SeckillPromotionService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("seckillPromotionService")
class SeckillPromotionServiceImpl : ServiceImpl<SeckillPromotionDao, SeckillPromotionEntity>(),
    SeckillPromotionService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SeckillPromotionEntity> = this.page(
            Query<SeckillPromotionEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}