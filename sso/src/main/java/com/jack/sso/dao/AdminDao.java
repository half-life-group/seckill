package com.jack.sso.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jack.sso.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao extends BaseMapper<Admin> {
}
