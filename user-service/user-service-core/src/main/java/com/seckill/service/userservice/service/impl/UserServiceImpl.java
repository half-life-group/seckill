package com.seckill.service.userservice.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seckill.service.userservice.dao.UserDao;
import com.seckill.service.userservice.service.UserService;
import com.sekill.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
