package com.sekill.api;

import com.seckill.common.utils.R;
import com.sekill.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(value = "user-service")
public interface UserAPI {

    @RequestMapping(value = "/getScore/{id}", method = RequestMethod.GET)
    String getUserScore(@PathVariable("id") String id);

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    R registerUser(@RequestBody Map<String,Object> map);

    @RequestMapping(value = "/findByUserName", method = RequestMethod.GET)
    User findByUserName(@RequestBody String userName);
}
