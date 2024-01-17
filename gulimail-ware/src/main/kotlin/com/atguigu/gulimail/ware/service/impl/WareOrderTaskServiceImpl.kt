package com.atguigu.gulimail.ware.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.ware.dao.WareOrderTaskDao
import com.atguigu.gulimail.ware.entity.WareOrderTaskEntity
import com.atguigu.gulimail.ware.service.WareOrderTaskService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("wareOrderTaskService")
class WareOrderTaskServiceImpl : ServiceImpl<WareOrderTaskDao, WareOrderTaskEntity>(), WareOrderTaskService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<WareOrderTaskEntity> = this.page(
            Query<WareOrderTaskEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}