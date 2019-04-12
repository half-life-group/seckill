package com.seckill.service.userservice.score;

import com.seckill.api.ScoreAPI;
import com.seckill.common.utils.R;
import com.seckill.common.utils.StringUtils;
import com.seckill.service.userservice.service.UserService;
import com.sekill.api.UserAPI;
import com.sekill.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Api
@RestController
public class UserServiceScore implements UserAPI {

    @Autowired
    private UserService userService;
    @Autowired
    private ScoreAPI scoreAPI;

    @ApiOperation(value = "积分", notes = "积分")
    @Override
    public String getUserScore(@PathVariable String id) {
        System.out.println("进入user-service:" + id);
        return scoreAPI.getScore(id);
    }

    @Override
    public R registerUser(@RequestBody Map<String, Object> map) {
        Map<String, Object> result = new HashMap<>();
        // 参数校验先不做了
        User user = new User();
        user.setAddTime(new Date());
        user.setName(StringUtils.getString(map.get("name")));
        user.setNickName(StringUtils.getString(map.get("nickName")));
        user.setPhone(StringUtils.getString(map.get("phone")));
        boolean insert = userService.insert(user);
        result.put("result",insert);
        return R.ok().put("data", result);
    }
}
