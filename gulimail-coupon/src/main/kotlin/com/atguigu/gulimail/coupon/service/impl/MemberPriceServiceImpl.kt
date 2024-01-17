package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.MemberPriceDao
import com.atguigu.gulimail.coupon.entity.MemberPriceEntity
import com.atguigu.gulimail.coupon.service.MemberPriceService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberPriceService")
class MemberPriceServiceImpl : ServiceImpl<MemberPriceDao, MemberPriceEntity>(), MemberPriceService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<MemberPriceEntity> = this.page(
            Query<MemberPriceEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}