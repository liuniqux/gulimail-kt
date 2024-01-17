package com.atguigu.gulimail.coupon

import com.atguigu.gulimail.coupon.service.CouponService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GulimailCouponApplicationTests @Autowired constructor(
    val couponService: CouponService
) {

    @Test
    fun contextLoads() {
        print("hello")
    }

}
