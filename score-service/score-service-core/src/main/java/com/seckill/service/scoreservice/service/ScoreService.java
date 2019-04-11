package com.seckill.service.scoreservice.service;

import com.baomidou.mybatisplus.service.IService;
import com.seckill.common.utils.PageUtils;
import com.seckill.entity.Score;

import java.util.Map;

public interface ScoreService extends IService<Score> {
    PageUtils queryPage(Map<String, Object> params);
}
