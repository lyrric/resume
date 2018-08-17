package com.web.freemarker.demo.feign;

import com.web.freemarker.demo.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程请求
 */
@FeignClient(name = "resume-server",url = "${resume.server.url}")
public interface ResumeFeign {

    /**
     * 发送请求,制作简历
     * @param userId 用户ID
     * @param resumeTplId 简历ID
     * @return
     */
    @RequestMapping(value = "/resume/create", method = RequestMethod.GET)
    JsonResult create(@RequestParam("userId") Integer userId, @RequestParam("resumeTplId")Integer resumeTplId);
}
