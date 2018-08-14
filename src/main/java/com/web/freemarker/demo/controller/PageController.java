package com.web.freemarker.demo.controller;

import com.web.freemarker.demo.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class PageController {

    @Resource
    private UserService userService;
    @Resource
    private CredentialService credentialService;
    @Resource
    private EducationService educationService;
    @Resource
    private JobService jobService;
    @Resource
    private ProjectService projectService;
    @Resource
    private SkillService skillService;

    /**
     * 用户首页
     * @param model
     * @return
     */
    @GetMapping(value = "/user/index")
    public String userIndex(Model model){
        model.addAttribute("user",userService.findById(1));
        model.addAttribute("credentials",credentialService.listByUserId(1));
        model.addAttribute("educations",educationService.listByUserId(1));
        model.addAttribute("jobs",jobService.listByUserId(1));
        model.addAttribute("projects",projectService.listByUserId(1));
        model.addAttribute("skills",skillService.listByUserId(1));
        return "user-index";
    }

    /**
     * 用户基本信息
     * @param model
     * @return
     */
    @GetMapping(value = "/user")
    public String userBaseInfo(Model model){
        model.addAttribute("user", userService.findById(1));
        return "user-base-info";
    }
}
