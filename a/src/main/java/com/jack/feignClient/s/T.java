package com.jack.feignClient.s;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class T {

    @Autowired
    private Bclient bclient;

    @RequestMapping("/01")
    public String get(){
        Map<String, String> map = new HashMap<>();
        map.put("id","1");
        map.put("name","aa");
        return bclient.get(JSONObject.toJSONString(map));
    }
        @RequestMapping("/02")
    public String get01(){
        Map<String, String> map = new HashMap<>();
        map.put("id","1");
        map.put("name","aa");
        return bclient.get01(JSONObject.toJSONString(map));
    }
    @GetMapping("/03")
    public String get03(){

        return bclient.get03();
    }
}
