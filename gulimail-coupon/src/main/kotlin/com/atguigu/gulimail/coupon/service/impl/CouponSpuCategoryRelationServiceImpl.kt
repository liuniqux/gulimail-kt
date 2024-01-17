package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.CouponSpuCategoryRelationDao
import com.atguigu.gulimail.coupon.entity.CouponSpuCategoryRelationEntity
import com.atguigu.gulimail.coupon.service.CouponSpuCategoryRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("couponSpuCategoryRelationService")
class CouponSpuCategoryRelationServiceImpl :
    ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity>(), CouponSpuCategoryRelationService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<CouponSpuCategoryRelationEntity> = this.page(
            Query<CouponSpuCategoryRelationEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}