package com.web.freemarker.demo.mapper;

import com.web.freemarker.demo.util.JsonResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程请求
 */
//@FeignClient(url = "${resume.server.url}")
public interface ResumeFeign {

    /**
     * 发送请求,制作简历
     * @param userId 用户ID
     * @param resumeTplId 简历ID
     * @return
     */
    @GetMapping(value = "/resume/create")
    JsonResult create(@RequestParam("userId") Integer userId, @RequestParam("resumeTplId")Integer resumeTplId);
}
