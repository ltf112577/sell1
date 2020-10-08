package com.sell.controller;

import com.alibaba.fastjson.JSON;
import com.sell.config.MyConfig;
import com.sell.enums.ResultEnum;
import com.sell.exception.SellException;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;
import java.util.Map;

@Controller
@RequestMapping("/wechat")
@Slf4j
public class WechatController {

    @Autowired
    private WxMpService wxMpService;

    private static final String HUI_USERINFO_URL = "https://open.huilianpay.com/output/userInfo?redirectUrl=%s&attach=%s";
    //    public static final String Notice_URL = "http://mall.didnggyggrgyy.cn";
    public static final String URL = "http://maxren.nat300.top";

    @GetMapping("/authorize")
    public String home(){
        String callbackUrl = URL + "/sell/wechat/userInfo";
        String url = String.format(HUI_USERINFO_URL, callbackUrl, "28446847561c4c6ea77c2b650ac33d4");
        return "redirect:" + url;
    }

    @GetMapping("/userInfo")
    public String home(HttpServletRequest request) {
        String machineNo = request.getParameter("attach");
        String userInfo = request.getParameter("userInfo");
        Map<String, Object> info = JSON.parseObject(userInfo, Map.class);
        Object openId = info.get("openid");
        Object userId = info.get("userid");
        if (openId == null) {
            openId = userId;
        }

        StringBuilder url = new StringBuilder(URL)
                .append("/#/home?machineNo=")
                .append(machineNo)
                .append("&openId=")
                .append(openId);
        return "redirect:" + url.toString();
    }








//    @GetMapping("/authorize")
//    public String authorize(@RequestParam("returnUrl") String returnUrl) {
//        String url = "http://1k7s239485.51mypc.cn/sell/wechat/userInfo";
//        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_BASE, URLEncoder.encode(returnUrl));
//        return "redirect:" + redirectUrl;
//    }
//
//    @GetMapping("/userInfo")
//    public String userInfo(@RequestParam("code") String code,
//                           @RequestParam("returnUrl") String returnUrl) {
//        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
//
//        try {
//            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
//        } catch (WxErrorException e) {
//            log.error("【微信网页授权】", e);
//            throw new SellException(ResultEnum.WECHAT_MP_ERROR.getCode(), e.getError().getErrorMsg());
//        }
//        String openId = wxMpOAuth2AccessToken.getOpenId();
//        return "redirect:" + returnUrl + "?openId" + openId;
//    }
}
