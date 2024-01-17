package com.atguigu.gulimail.coupon.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.coupon.entity.HomeSubjectEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 21:46:42
 */
interface HomeSubjectService : IService<HomeSubjectEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

