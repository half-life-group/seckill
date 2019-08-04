package com.jack.sso.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jack.sso.dao.AdminDao;
import com.jack.sso.entity.Admin;
import com.jack.sso.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminDao, Admin> implements AdminService {
}
