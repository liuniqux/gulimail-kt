package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.HomeSubjectDao
import com.atguigu.gulimail.coupon.entity.HomeSubjectEntity
import com.atguigu.gulimail.coupon.service.HomeSubjectService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("homeSubjectService")
class HomeSubjectServiceImpl : ServiceImpl<HomeSubjectDao, HomeSubjectEntity>(), HomeSubjectService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<HomeSubjectEntity> = this.page(
            Query<HomeSubjectEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}