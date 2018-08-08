package com.web.freemarker.demo.controller;

import com.web.freemarker.demo.entity.Credential;
import com.web.freemarker.demo.service.CredentialService;
import com.web.freemarker.demo.util.JsonResult;
import com.web.freemarker.demo.util.JsonResultUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 资格证书接口
 */
@RestController
@RequestMapping(value = "/credential")
public class CredentialController {

    @Resource
    private CredentialService credentialService;

    @GetMapping(value = "/list")
    public JsonResult list(){
        return JsonResultUtil.ok(credentialService.listByUserId(1));
    }

    @PostMapping
    public JsonResult update(Credential credential){
        credential.setUserId(1);
        credentialService.update(credential);
        return JsonResultUtil.ok();
    }

    @DeleteMapping(value = "/{id}")
    public JsonResult delete(@PathVariable int id){
        credentialService.delete(id, 1);
        return JsonResultUtil.ok();
    }
}
