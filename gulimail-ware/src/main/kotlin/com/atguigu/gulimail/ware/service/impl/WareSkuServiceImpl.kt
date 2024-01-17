package com.atguigu.gulimail.ware.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.ware.dao.WareSkuDao
import com.atguigu.gulimail.ware.entity.WareSkuEntity
import com.atguigu.gulimail.ware.service.WareSkuService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("wareSkuService")
class WareSkuServiceImpl : ServiceImpl<WareSkuDao, WareSkuEntity>(), WareSkuService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<WareSkuEntity> = this.page(
            Query<WareSkuEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}