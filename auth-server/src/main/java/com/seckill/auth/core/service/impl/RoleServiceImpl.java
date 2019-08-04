package com.seckill.auth.core.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seckill.auth.core.dao.RoleDao;
import com.seckill.auth.core.entity.Role;
import com.seckill.auth.core.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {
}
