package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.AttrDao
import com.atguigu.gulimail.product.entity.AttrEntity
import com.atguigu.gulimail.product.service.AttrService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("attrService")
class AttrServiceImpl : ServiceImpl<AttrDao, AttrEntity>(), AttrService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<AttrEntity> = this.page(
            Query<AttrEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}