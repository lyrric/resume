package com.web.freemarker.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.freemarker.demo.entity.ResumeTpl;
import com.web.freemarker.demo.mapper.ResumeFeign;
import com.web.freemarker.demo.mapper.ResumeTplMapper;
import com.web.freemarker.demo.service.ResumeTplService;
import com.web.freemarker.demo.util.JsonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ResumeTplServiceImpl implements ResumeTplService {

    @Resource
    private ResumeTplMapper resumeTplMapper;
    @Resource
    private ResumeFeign resumeFeign;

    @Override
    public PageInfo<ResumeTpl> page(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return new PageInfo<>(resumeTplMapper.page(),0);
    }

    @Override
    public JsonResult create(int userId, int resumeTplId) {
        JsonResult result = resumeFeign.create(userId, resumeTplId);
        return result;
    }
}
