package com.web.freemarker.demo.controller;

import com.web.freemarker.demo.entity.Education;
import com.web.freemarker.demo.service.CredentialService;
import com.web.freemarker.demo.service.EducationService;
import com.web.freemarker.demo.util.JsonResult;
import com.web.freemarker.demo.util.JsonResultUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * 教育经历接口
 */
@RestController
@RequestMapping(value = "/education")
public class EducationController {

    @Resource
    private EducationService educationService;

    @GetMapping(value = "/list")
    public JsonResult list(){
        return JsonResultUtil.ok(educationService.listByUserId(1));
    }


    @PostMapping
    public JsonResult update(Education education){
        education.setUserId(1);
        educationService.update(education);
        return JsonResultUtil.ok();
    }
    @DeleteMapping(value = "/{id}")
    public JsonResult delete(@PathVariable int id){
        educationService.delete(id, 1);
        return JsonResultUtil.ok();
    }
}
