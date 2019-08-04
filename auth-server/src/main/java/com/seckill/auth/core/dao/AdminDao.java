package com.seckill.auth.core.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seckill.auth.core.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao extends BaseMapper<Admin> {
}
