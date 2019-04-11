package com.seckill.service.scoreservice.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seckill.common.utils.PageUtils;
import com.seckill.common.utils.Query;
import com.seckill.entity.Score;
import com.seckill.service.scoreservice.dao.ScoreDao;
import com.seckill.service.scoreservice.service.ScoreService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreDao, Score> implements ScoreService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String uid = params.get("certId").toString();
        Page<Score> page = this.selectPage(
                new Query<Score>(params).getPage(),
                new EntityWrapper<Score>()
                        .eq(!"".equals(uid), "uid", uid)
                        .orderBy("id", false)
        );

        return new PageUtils(page);
    }
}
