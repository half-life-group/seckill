package com.seckill.api;

import com.seckill.common.utils.R;
import com.seckill.entity.Score;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.image.RescaleOp;

@FeignClient(value = "score-service")
public interface ScoreAPI {
    @RequestMapping(value = "/getScore/{id}", method = RequestMethod.GET)
    String getScore(@PathVariable("id") String id);

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    R save(Score score);

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    R update(Score score);

}
