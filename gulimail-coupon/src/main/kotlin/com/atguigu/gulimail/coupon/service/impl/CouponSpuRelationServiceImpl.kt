package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.CouponSpuRelationDao
import com.atguigu.gulimail.coupon.entity.CouponSpuRelationEntity
import com.atguigu.gulimail.coupon.service.CouponSpuRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("couponSpuRelationService")
class CouponSpuRelationServiceImpl : ServiceImpl<CouponSpuRelationDao, CouponSpuRelationEntity>(),
    CouponSpuRelationService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<CouponSpuRelationEntity> = this.page(
            Query<CouponSpuRelationEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}