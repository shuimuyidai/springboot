package com.shuimu.springboot2.controller;

import com.shuimu.springboot2.model.User;
import com.shuimu.springboot2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insert")
    @ResponseBody
    public void insert(User user) {
        userService.insert(user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") int id) {
        userService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update/{id}")
    @ResponseBody
    public void update(@RequestParam User user) {
        userService.update(user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/select")
    @ResponseBody
    public User select(@PathVariable("id") int id) {
        return userService.selectById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/selectAll/{pageNum}/{pageSize}")
    @ResponseBody
    public List<User> selectAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        return userService.selectAll(pageNum, pageSize);
    }
}
