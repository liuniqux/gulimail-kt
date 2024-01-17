package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.SpuInfoDescDao
import com.atguigu.gulimail.product.entity.SpuInfoDescEntity
import com.atguigu.gulimail.product.service.SpuInfoDescService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("spuInfoDescService")
class SpuInfoDescServiceImpl : ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity>(), SpuInfoDescService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<SpuInfoDescEntity> = this.page(
            Query<SpuInfoDescEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}