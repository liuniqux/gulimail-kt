package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.SkuLadderDao
import com.atguigu.gulimail.coupon.entity.SkuLadderEntity
import com.atguigu.gulimail.coupon.service.SkuLadderService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("skuLadderService")
class SkuLadderServiceImpl : ServiceImpl<SkuLadderDao, SkuLadderEntity>(), SkuLadderService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SkuLadderEntity> = this.page(
            Query<SkuLadderEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}