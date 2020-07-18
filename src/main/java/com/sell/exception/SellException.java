package com.sell.exception;

import com.sell.enums.ResultEnum;

/**
 * @program: sell
 * @description:
 * @author: Mr.Li
 * @create: 2020-07-05 16:27
 **/
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }

}
