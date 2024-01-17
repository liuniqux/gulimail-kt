package com.atguigu.gulimail.member.controller

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.R
import com.atguigu.gulimail.member.entity.MemberReceiveAddressEntity
import com.atguigu.gulimail.member.service.MemberReceiveAddressService
import org.springframework.web.bind.annotation.*

/**
 * 会员收货地址
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:03:20
 */
@RestController
@RequestMapping("member/memberreceiveaddress")
class MemberReceiveAddressController(
    val memberReceiveAddressService: MemberReceiveAddressService
) {

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:memberreceiveaddress:list")
    fun list(@RequestParam params: MutableMap<String, Any>): R {
        val page: PageUtils = memberReceiveAddressService.queryPage(params)

        return R.ok().put("page", page)
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:memberreceiveaddress:info")
    fun info(@PathVariable("id") id: Long): R {
        val memberReceiveAddress: MemberReceiveAddressEntity = memberReceiveAddressService.getById(id)

        return R.ok().put("memberReceiveAddress", memberReceiveAddress)
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:memberreceiveaddress:save")
    fun save(@RequestBody memberReceiveAddress: MemberReceiveAddressEntity): R {
        memberReceiveAddressService.save(memberReceiveAddress)

        return R.ok()
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:memberreceiveaddress:update")
    fun update(@RequestBody memberReceiveAddress: MemberReceiveAddressEntity): R {
        memberReceiveAddressService.updateById(memberReceiveAddress)

        return R.ok()
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:memberreceiveaddress:delete")
    fun delete(@RequestBody ids: Array<Long>): R {
        memberReceiveAddressService.removeByIds(listOf(ids))

        return R.ok()
    }

}
