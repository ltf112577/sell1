package com.sell.utils;

import java.util.Random;

/**
 * @program: sell
 * @description: 生成随机数
 * @author: Mr.Li
 * @create: 2020-07-05 15:57
 **/
public class KeyUtil {

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() +String.valueOf(number);
    }

}
