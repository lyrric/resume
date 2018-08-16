package com.web.freemarker.demo.controller;

import com.web.freemarker.demo.service.ResumeTplService;
import com.web.freemarker.demo.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 简历接口
 */
@RestController
@RequestMapping(value = "/resume")
public class ResumeController {

    @Resource
    private ResumeTplService resumeTplService;

    /**
     * 制作简历请求
     * @param resumeTplId 模板ID
     * @return
     */
    @GetMapping(value = "/create")
    public JsonResult createResume(int resumeTplId){
        return resumeTplService.create(1, resumeTplId);
    }
}
