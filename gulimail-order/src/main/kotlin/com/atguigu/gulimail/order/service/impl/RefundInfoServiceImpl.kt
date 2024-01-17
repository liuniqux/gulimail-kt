package com.atguigu.gulimail.order.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.order.dao.RefundInfoDao
import com.atguigu.gulimail.order.entity.RefundInfoEntity
import com.atguigu.gulimail.order.service.RefundInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("refundInfoService")
class RefundInfoServiceImpl : ServiceImpl<RefundInfoDao, RefundInfoEntity>(), RefundInfoService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<RefundInfoEntity> = this.page(
            Query<RefundInfoEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}