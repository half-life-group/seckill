package com.jack.feignClient.s;

import org.springframework.stereotype.Component;

@Component
public class BclientFailback implements Bclient{
    @Override
    public String get(String s) {
        return null;
    }

    @Override
    public String get01(String s) {
        return null;
    }

    @Override
    public String get03() {
        return "xxxxx";
    }
}
