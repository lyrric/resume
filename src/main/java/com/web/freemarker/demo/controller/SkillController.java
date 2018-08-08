package com.web.freemarker.demo.controller;

import com.web.freemarker.demo.entity.Project;
import com.web.freemarker.demo.entity.Skill;
import com.web.freemarker.demo.service.CredentialService;
import com.web.freemarker.demo.service.SkillService;
import com.web.freemarker.demo.util.JsonResult;
import com.web.freemarker.demo.util.JsonResultUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 技能接口
 */
@RestController
@RequestMapping(value = "/skill")
public class SkillController {

    @Resource
    private SkillService skillService;

    @GetMapping(value = "/list")
    public JsonResult list(){
        return JsonResultUtil.ok(skillService.listByUserId(1));
    }

    @PostMapping
    public JsonResult update(Skill skill){
        skill.setUserId(1);
        skillService.update(skill);
        return JsonResultUtil.ok();
    }

    @DeleteMapping(value = "/{id}")
    public JsonResult delete(@PathVariable int id){
        skillService.delete(id,1);
        return JsonResultUtil.ok();
    }

}
