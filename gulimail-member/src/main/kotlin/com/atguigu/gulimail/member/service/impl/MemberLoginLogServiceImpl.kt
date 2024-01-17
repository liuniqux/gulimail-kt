package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.MemberLoginLogDao
import com.atguigu.gulimail.member.entity.MemberLoginLogEntity
import com.atguigu.gulimail.member.service.MemberLoginLogService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberLoginLogService")
class MemberLoginLogServiceImpl : ServiceImpl<MemberLoginLogDao, MemberLoginLogEntity>(), MemberLoginLogService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<MemberLoginLogEntity> = this.page(
            Query<MemberLoginLogEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}