package com.atguigu.gulimail.product

import com.atguigu.gulimail.product.entity.BrandEntity
import com.atguigu.gulimail.product.service.BrandService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GulimailProductApplicationTests @Autowired constructor(
    val brandService: BrandService
) {

    @Test
    fun contextLoads() {
        // val brand = BrandEntity("iphone", "a phone")
        // val count = brandService.save(brand)
        val list = brandService.ktQuery().eq(BrandEntity::name, "iphone").list()
        print("保存完成！$list")
    }

}
