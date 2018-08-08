package com.web.freemarker.demo.service.impl;

import com.web.freemarker.demo.entity.Project;
import com.web.freemarker.demo.mapper.ProjectMapper;
import com.web.freemarker.demo.service.BaseService;
import com.web.freemarker.demo.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public List<Project> listByUserId(int userId) {
        return projectMapper.listByUserId(userId);
    }

    @Override
    public void update(Project project) {
        if(project.getId() == null){
            projectMapper.insert(project);
        }else{
            //判断当前数据是否属于当前登录用户
            //属于则进行更新操作,不属于忽略
            Project t = projectMapper.selectByPrimaryKey(project.getId());
            if(t != null && t.getUserId().equals(project.getUserId())){
                projectMapper.updateByPrimaryKeySelective(project);
            }
        }
    }

    @Override
    public void delete(int id, int userId) {
        projectMapper.delete(id, userId);
    }



}
