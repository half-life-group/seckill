package com.sekill.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service")
public interface UserAPI {

    @RequestMapping(value = "/getScore/{id}", method = RequestMethod.GET)
    String getUserScore(@PathVariable("id") String id);
}
