package com.web.freemarker.demo.service.impl;

import com.web.freemarker.demo.entity.Education;
import com.web.freemarker.demo.entity.Job;
import com.web.freemarker.demo.mapper.EducationMapper;
import com.web.freemarker.demo.service.BaseService;
import com.web.freemarker.demo.service.CredentialService;
import com.web.freemarker.demo.service.EducationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {

    @Resource
    private EducationMapper educationMapper;
    @Override
    public List<Education> listByUserId(int userId) {
        return educationMapper.listByUserId(userId);
    }

    @Override
    public void update(Education education) {
        if(education.getId() == null){
            educationMapper.insert(education);
        }else{
            //判断当前数据是否属于当前登录用户
            //属于则进行更新操作,不属于忽略
            Education t = educationMapper.selectByPrimaryKey(education.getId());
            if(t != null && t.getUserId().equals(education.getUserId())){
                educationMapper.updateByPrimaryKeySelective(education);
            }
        }
    }

    @Override
    public void delete(int id, int userId) {
        educationMapper.delete(id, userId);
    }



}
