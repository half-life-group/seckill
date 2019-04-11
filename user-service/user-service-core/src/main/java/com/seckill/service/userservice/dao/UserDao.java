package com.seckill.service.userservice.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sekill.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
