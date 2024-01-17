package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.CouponHistoryDao
import com.atguigu.gulimail.coupon.entity.CouponHistoryEntity
import com.atguigu.gulimail.coupon.service.CouponHistoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("couponHistoryService")
class CouponHistoryServiceImpl : ServiceImpl<CouponHistoryDao, CouponHistoryEntity>(), CouponHistoryService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<CouponHistoryEntity> = this.page(
            Query<CouponHistoryEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}