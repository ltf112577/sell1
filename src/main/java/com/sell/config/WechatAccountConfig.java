package com.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("wechat")
public class WechatAccountConfig {

    /**
     *公众平台id
     **/
    public String mpAppId;

    /**
     *公众平台密钥
     */
    public String mpAppSecret;
}
