package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.MemberStatisticsInfoDao
import com.atguigu.gulimail.member.entity.MemberStatisticsInfoEntity
import com.atguigu.gulimail.member.service.MemberStatisticsInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberStatisticsInfoService")
class MemberStatisticsInfoServiceImpl : ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity>(),
    MemberStatisticsInfoService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<MemberStatisticsInfoEntity> = this.page(
            Query<MemberStatisticsInfoEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}