package com.atguigu.gulimail.order.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

/**
 * 订单项信息
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@TableName("oms_order_item")
data class OrderItemEntity(

    /**
     * id
     */
    @TableId
    val id: Long,

    /**
     * order_id
     */
    val orderId: Long,

    /**
     * order_sn
     */
    val orderSn: String,

    /**
     * spu_id
     */
    val spuId: Long,

    /**
     * spu_name
     */
    val spuName: String,

    /**
     * spu_pic
     */
    val spuPic: String,

    /**
     * 品牌
     */
    val spuBrand: String,

    /**
     * 商品分类id
     */
    val categoryId: Long,

    /**
     * 商品sku编号
     */
    val skuId: Long,

    /**
     * 商品sku名字
     */
    val skuName: String,

    /**
     * 商品sku图片
     */
    val skuPic: String,

    /**
     * 商品sku价格
     */
    val skuPrice: BigDecimal,

    /**
     * 商品购买的数量
     */
    val skuQuantity: Int,

    /**
     * 商品销售属性组合（JSON）
     */
    val skuAttrsVals: String,

    /**
     * 商品促销分解金额
     */
    val promotionAmount: BigDecimal,

    /**
     * 优惠券优惠分解金额
     */
    val couponAmount: BigDecimal,

    /**
     * 积分优惠分解金额
     */
    val integrationAmount: BigDecimal,

    /**
     * 该商品经过优惠后的分解金额
     */
    val realAmount: BigDecimal,

    /**
     * 赠送积分
     */
    val giftIntegration: Int,

    /**
     * 赠送成长值
     */
    val giftGrowth: Int
) : Serializable
