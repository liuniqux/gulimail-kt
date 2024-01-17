package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.GrowthChangeHistoryDao
import com.atguigu.gulimail.member.entity.GrowthChangeHistoryEntity
import com.atguigu.gulimail.member.service.GrowthChangeHistoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("growthChangeHistoryService")
class GrowthChangeHistoryServiceImpl : ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity>(),
    GrowthChangeHistoryService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<GrowthChangeHistoryEntity> = this.page(
            Query<GrowthChangeHistoryEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}