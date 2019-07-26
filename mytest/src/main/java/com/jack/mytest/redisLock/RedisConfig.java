package com.jack.mytest.redisLock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisConfig {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    /**
     * Set value for key, only if key does not exist.
     *
     * @param key
     * @param value
     * @param seconds 过期时间
     * @return
     */
    public boolean setNX(final String key, final String value, final int seconds) {
        boolean result = stringRedisTemplate.execute((RedisCallback<Boolean>) connection -> {
            RedisSerializer<String> serializer = stringRedisTemplate
                    .getStringSerializer();
            byte[] keyByte = serializer.serialize(key);
            byte[] nameByte = serializer.serialize(value);
            boolean flag = connection.setNX(keyByte, nameByte);
            if (flag) {
                connection.expire(keyByte, seconds);
            }
            return flag;
        });
        return result;
    }

    /**
     * 获取value
     *
     * @param key
     * @return
     */
    public String get(final String key) {
        String result = (String) stringRedisTemplate.execute(new RedisCallback<String>() {

            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = stringRedisTemplate
                        .getStringSerializer();
                byte[] keyByte = serializer.serialize(key);
                byte[] valueByte = connection.get(keyByte);
                if (valueByte == null) {
                    return null;
                }
                String value = serializer.deserialize(valueByte);
                return value;
            }

        });
        return result;
    }

    /**
     * 获取过期时间
     *
     * @param key
     * @return
     */
    public Long getExpiry(final String key) {
        return stringRedisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

}
