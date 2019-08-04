package com.seckill.auth.core.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seckill.auth.core.dao.AdminDao;
import com.seckill.auth.core.entity.Admin;
import com.seckill.auth.core.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminDao, Admin> implements AdminService {
}
