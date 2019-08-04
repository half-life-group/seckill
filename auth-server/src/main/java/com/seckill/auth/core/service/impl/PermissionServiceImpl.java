package com.seckill.auth.core.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seckill.auth.core.dao.PermissionDao;
import com.seckill.auth.core.entity.Permission;
import com.seckill.auth.core.service.PermissionService;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, Permission> implements PermissionService {
}
