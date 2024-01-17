package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.MemberDao
import com.atguigu.gulimail.member.entity.MemberEntity
import com.atguigu.gulimail.member.service.MemberService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberService")
class MemberServiceImpl : ServiceImpl<MemberDao, MemberEntity>(), MemberService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<MemberEntity> = this.page(
            Query<MemberEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}