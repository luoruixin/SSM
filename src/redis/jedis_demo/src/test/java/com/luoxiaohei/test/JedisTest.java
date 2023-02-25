package com.luoxiaohei.test;

import org.testng.annotations.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisTest {
    @Test
    public void testRedis(){
        //1.获取链接
        Jedis jedis=new Jedis("localhost",6379);
        //2.执行操作
        jedis.set("username","xiaoming");

        String value = jedis.get("username");
        System.out.println(value);

//        jedis.del("username");

        jedis.hset("myhash","addr","beijing");
        String hValue = jedis.hget("myhash", "addr");
        System.out.println(hValue);

        Set<String> keys = jedis.keys("*");
        System.out.println("---------------------------------");
        for (String key : keys) {
            System.out.println(key);
        }
        //3.关闭链接
        jedis.close();
    }
}
