package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.IntegrationChangeHistoryDao
import com.atguigu.gulimail.member.entity.IntegrationChangeHistoryEntity
import com.atguigu.gulimail.member.service.IntegrationChangeHistoryService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("integrationChangeHistoryService")
class IntegrationChangeHistoryServiceImpl : ServiceImpl<IntegrationChangeHistoryDao, IntegrationChangeHistoryEntity>(),
    IntegrationChangeHistoryService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<IntegrationChangeHistoryEntity> = this.page(
            Query<IntegrationChangeHistoryEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}