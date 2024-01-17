package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.SeckillSkuNoticeDao
import com.atguigu.gulimail.coupon.entity.SeckillSkuNoticeEntity
import com.atguigu.gulimail.coupon.service.SeckillSkuNoticeService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("seckillSkuNoticeService")
class SeckillSkuNoticeServiceImpl : ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity>(),
    SeckillSkuNoticeService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SeckillSkuNoticeEntity> = this.page(
            Query<SeckillSkuNoticeEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}