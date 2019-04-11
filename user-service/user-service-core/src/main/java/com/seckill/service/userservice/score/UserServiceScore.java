package com.seckill.service.userservice.score;

import com.seckill.api.ScoreAPI;
import com.seckill.entity.Score;
import com.sekill.api.UserAPI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Api
@RestController
public class UserServiceScore implements UserAPI {

    @Autowired
    private ScoreAPI scoreAPI;

    @ApiOperation(value = "积分",notes = "积分")
    @Override
    public String getUserScore(@PathVariable String id) {
        System.out.println("进入user-service:"+id);
        return scoreAPI.getScore(id);
    }
}
