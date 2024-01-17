package com.atguigu.gulimail.coupon.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.coupon.dao.HomeSubjectSpuDao
import com.atguigu.gulimail.coupon.entity.HomeSubjectSpuEntity
import com.atguigu.gulimail.coupon.service.HomeSubjectSpuService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("homeSubjectSpuService")
class HomeSubjectSpuServiceImpl : ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity>(), HomeSubjectSpuService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<HomeSubjectSpuEntity> = this.page(
            Query<HomeSubjectSpuEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}