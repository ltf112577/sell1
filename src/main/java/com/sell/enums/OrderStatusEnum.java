package com.sell.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description:
 * @author: Mr.Li
 * @create: 2020-06-28 22:54
 **/
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
