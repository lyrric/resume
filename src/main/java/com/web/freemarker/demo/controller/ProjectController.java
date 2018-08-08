package com.web.freemarker.demo.controller;

import com.web.freemarker.demo.entity.Job;
import com.web.freemarker.demo.entity.Project;
import com.web.freemarker.demo.service.ProjectService;
import com.web.freemarker.demo.util.JsonResult;
import com.web.freemarker.demo.util.JsonResultUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 项目经验接口
 */
@RestController
@RequestMapping(value = "/project")
public class ProjectController {

    @Resource
    private ProjectService projectService;

    @GetMapping(value = "/list")
    public JsonResult list(){
        return JsonResultUtil.ok(projectService.listByUserId(1));
    }

    @PostMapping
    public JsonResult update(Project project){
        project.setUserId(1);
        projectService.update(project);
        return JsonResultUtil.ok();
    }

    @DeleteMapping(value = "/{id}")
    public JsonResult delete(@PathVariable int id){
        projectService.delete(id,1);
        return JsonResultUtil.ok();
    }
}
