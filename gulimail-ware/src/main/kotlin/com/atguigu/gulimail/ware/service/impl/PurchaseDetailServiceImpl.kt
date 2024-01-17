package com.atguigu.gulimail.ware.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.ware.dao.PurchaseDetailDao
import com.atguigu.gulimail.ware.entity.PurchaseDetailEntity
import com.atguigu.gulimail.ware.service.PurchaseDetailService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("purchaseDetailService")
class PurchaseDetailServiceImpl : ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity>(), PurchaseDetailService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<PurchaseDetailEntity> = this.page(
            Query<PurchaseDetailEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}