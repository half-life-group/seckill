package com.jack.sso.oauth2;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.jack.sso.entity.Admin;
import com.jack.sso.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AdminService adminService;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Wrapper<Admin> adminWrapper = new EntityWrapper<Admin>();
        adminWrapper.eq("name", name);
        Admin admin = adminService.selectOne(adminWrapper);
        if (admin == null) {
            throw new UsernameNotFoundException("UserName" + name + "not found");
        }
        return new User(admin.getName(), admin.getPassword(), null);
    }
}
