package com.web.freemarker.demo.controller;

import com.web.freemarker.demo.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 用户介绍
     * @param model
     * @return
     */
    @GetMapping(value = "/user/introduction")
    public String introduction(Model model){
        model.addAttribute("user", userService.findById(1));
        return "user-introduction";
    }

    /**
     * 资格证书
     * @return
     */
    @GetMapping(value = "/credential")
    public String credential(){
        return "user-credential";
    }

    /**
     * 教育经历
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "/education/{id}")
    public String education(@PathVariable int id, Model model){
        if(id != 0){
            model.addAttribute("education", educationService.findByIdAndUserId(id, 1));
        }
        return "user-education";
    }

    /**
     * 工资经历
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "/job/{id}")
    public String job(@PathVariable int id, Model model){
        if(id != 0){
            model.addAttribute("job", jobService.findByIdAndUserId(id, 1));
        }
        return "user-job";
    }

    /**
     * 项目经验
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "/project/{id}")
    public String project(@PathVariable int id, Model model){
        if(id != 0){
            model.addAttribute("project", projectService.findByIdAndUserId(id, 1));
        }
        return "user-project";
    }

    /**
     * 技能
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "/skill/{id}")
    public String skill(@PathVariable int id, Model model){
        if(0 != id){
            model.addAttribute("skill", skillService.findByIdAndUserId(id, 1));
        }
        return "user-skill";
    }
}
