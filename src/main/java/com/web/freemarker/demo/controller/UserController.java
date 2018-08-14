package com.web.freemarker.demo.controller;


import com.web.freemarker.demo.entity.Skill;
import com.web.freemarker.demo.entity.User;
import com.web.freemarker.demo.service.UserService;
import com.web.freemarker.demo.util.JsonResult;
import com.web.freemarker.demo.util.JsonResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 用户接口
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping
    public JsonResult update(User user){
        user.setId(1);
        userService.update(user);
        return JsonResultUtil.ok();
    }
}
