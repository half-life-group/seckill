package com.seckill.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "score-service")
public interface ScoreAPI {
    @RequestMapping(value = "/getScore/{id}",method = RequestMethod.GET)
    String getScore(@PathVariable("id") String id);
}
