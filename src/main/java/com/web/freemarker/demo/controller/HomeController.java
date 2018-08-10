package com.web.freemarker.demo.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.web.freemarker.demo.util.FileUtil;
import com.web.freemarker.demo.util.JsonResult;
import com.web.freemarker.demo.util.JsonResultUtil;
import com.web.freemarker.demo.util.QiniuUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
public class HomeController {

    @Resource
    private QiniuUtil qiniuUtil;

    /**
     * 文件上传
     * @param upFile
     * @return
     */
    @PostMapping(value = "/upload")
    public JsonResult upload(MultipartFile upFile){
        if(upFile == null){return JsonResultUtil.error("文件错误!");}
        String ext = FileUtil.getExtByName(upFile.getOriginalFilename());
        if(ext == null){return JsonResultUtil.error("文件格式错误");}
        String uploadPath = FileUtil.generateFullUploadPath(ext);
        if(qiniuUtil.upload(upFile, uploadPath)){
            return JsonResultUtil.ok(qiniuUtil.getUrl()+"/"+uploadPath);
        }
        return JsonResultUtil.error("上传失败");
    }
}
