package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.MemberCollectSubjectDao
import com.atguigu.gulimail.member.entity.MemberCollectSubjectEntity
import com.atguigu.gulimail.member.service.MemberCollectSubjectService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberCollectSubjectService")
class MemberCollectSubjectServiceImpl : ServiceImpl<MemberCollectSubjectDao, MemberCollectSubjectEntity>(),
    MemberCollectSubjectService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<MemberCollectSubjectEntity> = this.page(
            Query<MemberCollectSubjectEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}