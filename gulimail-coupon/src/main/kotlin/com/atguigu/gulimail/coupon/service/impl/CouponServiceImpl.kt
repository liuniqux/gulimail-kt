package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.CouponDao
import com.atguigu.gulimail.coupon.entity.CouponEntity
import com.atguigu.gulimail.coupon.service.CouponService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("couponService")
class CouponServiceImpl : ServiceImpl<CouponDao, CouponEntity>(), CouponService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<CouponEntity> = this.page(
            Query<CouponEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}