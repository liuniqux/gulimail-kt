/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.atguigu.common.utils

import org.apache.http.HttpStatus

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */

class R : HashMap<String, Any>() {
    val serialVersionUID: Long = 1L

    companion object {
        fun error(): R {
            return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员")
        }

        fun error(msg: String): R {
            return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg)
        }

        fun error(code: Int, msg: String): R {
            val r = R()
            r["code"] = code
            r["msg"] = msg
            return r
        }

        fun ok(msg: String): R {
            val r = R()
            r["msg"] = msg
            return r
        }

        fun ok(map: Map<String, Any>): R {
            val r = R()
            r.putAll(map)
            return r
        }

        fun ok(): R {
            return R()
        }
    }

    init {
        put("code", 0)
        put("msg", "success")
    }

    override fun put(key: String, value: Any): R {
        super.put(key, value)
        return this
    }
}
