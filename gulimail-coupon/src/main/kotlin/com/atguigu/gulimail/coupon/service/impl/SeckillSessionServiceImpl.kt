package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.SeckillSessionDao
import com.atguigu.gulimail.coupon.entity.SeckillSessionEntity
import com.atguigu.gulimail.coupon.service.SeckillSessionService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("seckillSessionService")
class SeckillSessionServiceImpl : ServiceImpl<SeckillSessionDao, SeckillSessionEntity>(), SeckillSessionService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SeckillSessionEntity> = this.page(
            Query<SeckillSessionEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}