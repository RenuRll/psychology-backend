package com.example.psychologybackend.utils;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

public class WxUtils {
        public static Map<String,Object> getSessionKeyAndOpenId(String code,String appid,String secret){
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
            String replaceUrl = url.replace("APPID", appid).replace("SECRET", secret).replace("JSCODE", code);
            String res = HttpUtil.get(replaceUrl);
            Map<String, Object> map = JsonMapperUtils.jsonString2Map(res);
            return map;
        }
}
