package com.atguigu.common.utils

import com.atguigu.common.validator.group.AliyunGroup
import com.atguigu.common.validator.group.QcloudGroup
import com.atguigu.common.validator.group.QiniuGroup
import java.util.stream.Stream

/**
 * 常量
 */
object Constant {
    /**
     * 超级管理员ID
     */
    const val SUPER_ADMIN = 1

    /**
     * 当前页码
     */
    const val PAGE = "page"

    /**
     * 每页显示记录数
     */
    const val LIMIT = "limit"

    /**
     * 排序字段
     */
    const val ORDER_FIELD = "sidx"

    /**
     * 排序方式
     */
    const val ORDER = "order"

    /**
     * 升序
     */
    const val ASC = "asc"

    /**
     * 菜单类型
     */
    enum class MenuType(private val value: Int) {
        /**
         * 目录
         */
        CATALOG(0),

        /**
         * 菜单
         */
        MENU(1),

        /**
         * 按钮
         */
        BUTTON(2);

        fun getValue(): Int = value
    }

    /**
     * 定时任务状态
     */
    enum class ScheduleStatus(private val value: Int) {
        /**
         * 正常
         */
        NORMAL(0),

        /**
         * 暂停
         */
        PAUSE(1);

        fun getValue(): Int = value
    }

    /**
     * 云服务商
     */
    enum class CloudService(private val value: Int, private val validatorGroupClass: Class<*>) {
        /**
         * 七牛云
         */
        QINIU(1, QiniuGroup::class.java),

        /**
         * 阿里云
         */
        ALIYUN(2, AliyunGroup::class.java),

        /**
         * 腾讯云
         */
        QCLOUD(3, QcloudGroup::class.java);

        fun getValue(): Int = value

        fun getValidatorGroupClass(): Class<*> = validatorGroupClass

        companion object {
            fun getByValue(value: Int): CloudService {
                return Stream.of(*entries.toTypedArray())
                    .filter { cs -> value == cs.value }
                    .findFirst()
                    .orElseThrow { IllegalArgumentException("非法的枚举值:$value") }
            }
        }
    }
}
