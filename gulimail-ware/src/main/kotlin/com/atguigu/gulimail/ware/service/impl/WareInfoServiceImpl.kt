package com.atguigu.gulimail.ware.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.ware.dao.WareInfoDao
import com.atguigu.gulimail.ware.entity.WareInfoEntity
import com.atguigu.gulimail.ware.service.WareInfoService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("wareInfoService")
class WareInfoServiceImpl : ServiceImpl<WareInfoDao, WareInfoEntity>(), WareInfoService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<WareInfoEntity> = this.page(
            Query<WareInfoEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}