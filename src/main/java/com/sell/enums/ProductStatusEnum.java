package com.sell.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description: 商品状态
 * @author: Mr.Li
 * @create: 2020-06-22 11:24
 **/
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
