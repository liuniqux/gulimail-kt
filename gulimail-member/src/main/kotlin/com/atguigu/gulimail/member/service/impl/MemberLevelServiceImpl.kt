package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.MemberLevelDao
import com.atguigu.gulimail.member.entity.MemberLevelEntity
import com.atguigu.gulimail.member.service.MemberLevelService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberLevelService")
class MemberLevelServiceImpl : ServiceImpl<MemberLevelDao, MemberLevelEntity>(), MemberLevelService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<MemberLevelEntity> = this.page(
            Query<MemberLevelEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}