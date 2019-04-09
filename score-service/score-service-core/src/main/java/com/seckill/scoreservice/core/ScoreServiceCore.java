package com.seckill.scoreservice.core;

import com.seckill.api.ScoreAPI;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreServiceCore implements ScoreAPI {

    @Override
    public String getScore(@PathVariable String id) {
        System.out.println("进入score-service:"+id);
        return "积分:"+id;
    }
}
