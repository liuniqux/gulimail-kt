package com.atguigu.gulimail.order.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.order.dao.PaymentInfoDao
import com.atguigu.gulimail.order.entity.PaymentInfoEntity
import com.atguigu.gulimail.order.service.PaymentInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("paymentInfoService")
class PaymentInfoServiceImpl : ServiceImpl<PaymentInfoDao, PaymentInfoEntity>(), PaymentInfoService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<PaymentInfoEntity> = this.page(
            Query<PaymentInfoEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}