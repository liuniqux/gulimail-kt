package com.atguigu.gulimail.ware.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.ware.dao.PurchaseDao
import com.atguigu.gulimail.ware.entity.PurchaseEntity
import com.atguigu.gulimail.ware.service.PurchaseService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("purchaseService")
class PurchaseServiceImpl : ServiceImpl<PurchaseDao, PurchaseEntity>(), PurchaseService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<PurchaseEntity> = this.page(
            Query<PurchaseEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}