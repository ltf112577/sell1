package com.sell.utils;

import com.sell.enums.CodeEnum;

/**
 * @program: sell
 * @description:
 * @author: Mr.Li
 * @create: 2020-07-03 18:46
 **/
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()){
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
