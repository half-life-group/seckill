package com.seckill.auth.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 用户信息控制器
 */
@RestController
public class UserController {

    /**
     * 获取授权用户的信息
     *
     * @param user 当前用户
     * @return 授权信息
     */
    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
