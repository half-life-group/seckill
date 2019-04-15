package com.seckill.service.scoreservice.core;

import com.seckill.api.ScoreAPI;
import com.seckill.common.utils.R;
import com.seckill.entity.Score;
import com.seckill.service.scoreservice.service.ScoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@Api
@RestController
public class ScoreServiceCore implements ScoreAPI {

    @Autowired
    private ScoreService scoreService;

    @Override
    public String getScore(@PathVariable String id) {
        System.out.println("进入score-service:" + id);
        return "积分:" + id;
    }

    @Override
    @ApiOperation(value = "初始化积分", notes = "初始化积分")
    public R save(Score score) {
        return R.ok().put("data", scoreService.insert(score));
    }

    @Override
    @ApiOperation(value = "更新积分", notes = "更新积分")
    public R update(Score score) {
        return R.ok().put("data", scoreService.updateById(score));
    }

    @RequestMapping("/getOne")
    @ApiOperation(value = "查积分", notes = "查积分")
    public R getScore(@RequestBody Map<String, Object> params) {
        Score score = scoreService.selectById(Integer.parseInt(params.get("id").toString()));
        return R.ok().put("data", score);
    }

}
