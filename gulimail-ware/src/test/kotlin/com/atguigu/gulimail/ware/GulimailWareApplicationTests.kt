package com.atguigu.gulimail.ware

import com.atguigu.gulimail.ware.service.PurchaseService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GulimailWareApplicationTests @Autowired constructor(
    val purchaseService: PurchaseService
) {

    @Test
    fun contextLoads() {
    }

}
