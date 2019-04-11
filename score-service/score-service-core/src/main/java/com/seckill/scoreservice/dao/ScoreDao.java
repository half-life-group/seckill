package com.seckill.scoreservice.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seckill.entity.Score;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author baihe
 * @email www.baihe.com
 * @date 2019-01-16 15:13:05
 */
@Mapper
public interface ScoreDao extends BaseMapper<Score> {
	
}
