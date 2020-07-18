package com.sell.dto;

import lombok.Data;

/**
 * 购物车
 * @program: sell
 * @description:
 * @author: Mr.Li
 * @create: 2020-07-05 15:53
 **/
@Data
public class CartDTO {

    /** 商品Id*/
    private String productId;

    /** 数量。*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
