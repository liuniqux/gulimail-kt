package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.AttrAttrgroupRelationDao
import com.atguigu.gulimail.product.entity.AttrAttrgroupRelationEntity
import com.atguigu.gulimail.product.service.AttrAttrgroupRelationService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("attrAttrgroupRelationService")
class AttrAttrgroupRelationServiceImpl : ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity>(),
    AttrAttrgroupRelationService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<AttrAttrgroupRelationEntity> = this.page(
            Query<AttrAttrgroupRelationEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}