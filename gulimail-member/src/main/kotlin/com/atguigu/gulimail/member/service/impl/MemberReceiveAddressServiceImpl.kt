package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.MemberReceiveAddressDao
import com.atguigu.gulimail.member.entity.MemberReceiveAddressEntity
import com.atguigu.gulimail.member.service.MemberReceiveAddressService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberReceiveAddressService")
class MemberReceiveAddressServiceImpl : ServiceImpl<MemberReceiveAddressDao, MemberReceiveAddressEntity>(),
    MemberReceiveAddressService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<MemberReceiveAddressEntity> = this.page(
            Query<MemberReceiveAddressEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}