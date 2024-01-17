package com.atguigu.gulimail.product.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.product.dao.AttrGroupDao
import com.atguigu.gulimail.product.entity.AttrGroupEntity
import com.atguigu.gulimail.product.service.AttrGroupService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service


@Service("attrGroupService")
class AttrGroupServiceImpl : ServiceImpl<AttrGroupDao, AttrGroupEntity>(), AttrGroupService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<AttrGroupEntity> = this.page(
            Query<AttrGroupEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}