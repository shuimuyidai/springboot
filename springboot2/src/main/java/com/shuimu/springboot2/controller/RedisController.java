package com.shuimu.springboot2.controller;

import com.shuimu.springboot2.model.User;
import com.shuimu.springboot2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.BoundGeoOperations;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/redis")
public class RedisController {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    @Qualifier("userRedisTemplate")
//    private RedisTemplate<String, User> rts;
//
//    @RequestMapping(value = "/insertRedis")
//    @ResponseBody
//    public void redisAdd() {
////        User user = new User();
////        user.setUserName("赵六");
////        user.setAge(16);
////        user.setCreateTime(new Date(System.nanoTime()));
////        System.out.println("put:" + user);
////        User user1 = rts.opsForValue().get("user3");
////        System.out.println(user1.getUserName());
////        System.out.println("get:" + user1);
////        userService.insert(user);
//    }
}
