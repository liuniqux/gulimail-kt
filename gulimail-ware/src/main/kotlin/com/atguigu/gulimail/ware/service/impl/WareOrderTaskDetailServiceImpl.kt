package com.atguigu.gulimail.ware.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.ware.dao.WareOrderTaskDetailDao
import com.atguigu.gulimail.ware.entity.WareOrderTaskDetailEntity
import com.atguigu.gulimail.ware.service.WareOrderTaskDetailService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("wareOrderTaskDetailService")
class WareOrderTaskDetailServiceImpl : ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity>(),
    WareOrderTaskDetailService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<WareOrderTaskDetailEntity> = this.page(
            Query<WareOrderTaskDetailEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}