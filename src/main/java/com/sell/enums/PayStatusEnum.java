package com.sell.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description:
 * @author: Mr.Li
 * @create: 2020-06-28 22:59
 **/
@Getter
public enum  PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
