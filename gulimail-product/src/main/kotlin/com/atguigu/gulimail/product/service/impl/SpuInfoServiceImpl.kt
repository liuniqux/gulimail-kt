package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.SpuInfoDao
import com.atguigu.gulimail.product.entity.SpuInfoEntity
import com.atguigu.gulimail.product.service.SpuInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("spuInfoService")
class SpuInfoServiceImpl : ServiceImpl<SpuInfoDao, SpuInfoEntity>(), SpuInfoService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SpuInfoEntity> = this.page(
            Query<SpuInfoEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}