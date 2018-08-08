package com.web.freemarker.demo.controller;

import com.web.freemarker.demo.entity.Education;
import com.web.freemarker.demo.entity.Job;
import com.web.freemarker.demo.service.CredentialService;
import com.web.freemarker.demo.service.JobService;
import com.web.freemarker.demo.util.JsonResult;
import com.web.freemarker.demo.util.JsonResultUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 工作经历接口
 */
@RestController
@RequestMapping(value = "/job")
public class JobController {

    @Resource
    private JobService jobService;

    @GetMapping(value = "/list")
    public JsonResult list(){
        return JsonResultUtil.ok(jobService.listByUserId(1));
    }

    @PostMapping
    public JsonResult update(Job job){
        job.setUserId(1);
        jobService.update(job);
        return JsonResultUtil.ok();
    }

    @DeleteMapping(value = "/{id}")
    public JsonResult delete(@PathVariable int id){
        jobService.delete(id,1);
        return JsonResultUtil.ok();
    }
}
