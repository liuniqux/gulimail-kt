package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.SkuInfoDao
import com.atguigu.gulimail.product.entity.SkuInfoEntity
import com.atguigu.gulimail.product.service.SkuInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("skuInfoService")
class SkuInfoServiceImpl : ServiceImpl<SkuInfoDao, SkuInfoEntity>(), SkuInfoService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SkuInfoEntity> = this.page(
            Query<SkuInfoEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}