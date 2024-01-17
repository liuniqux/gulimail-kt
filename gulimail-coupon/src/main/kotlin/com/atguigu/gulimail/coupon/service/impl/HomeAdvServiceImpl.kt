package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.HomeAdvDao
import com.atguigu.gulimail.coupon.entity.HomeAdvEntity
import com.atguigu.gulimail.coupon.service.HomeAdvService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("homeAdvService")
class HomeAdvServiceImpl : ServiceImpl<HomeAdvDao, HomeAdvEntity>(), HomeAdvService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<HomeAdvEntity> = this.page(
            Query<HomeAdvEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}