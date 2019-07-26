package com.jack.mytest;

import com.jack.mytest.redisLock.RedisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {

    @Autowired
    private RedisConfig redisConfig;

    @Test
    public void test() {

        String redisKey = "a" + ":" + 123;
        boolean lock = redisConfig.setNX(redisKey, "1", 1800);
        System.out.println("获取锁:"+lock);
        if (!lock) {
            return;
        }

    }
}
