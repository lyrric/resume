package com.web.freemarker.demo.service.impl;

import com.web.freemarker.demo.entity.Project;
import com.web.freemarker.demo.entity.Skill;
import com.web.freemarker.demo.mapper.SkillMapper;
import com.web.freemarker.demo.service.BaseService;
import com.web.freemarker.demo.service.ProjectService;
import com.web.freemarker.demo.service.SkillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Resource
    private SkillMapper skillMapper;


    @Override
    public List<Skill> listByUserId(int userId) {
        return skillMapper.listByUserId(userId);
    }

    @Override
    public void update(Skill skill) {
        if(skill.getId() == null){
            skillMapper.insert(skill);
        }else{
            //判断当前数据是否属于当前登录用户
            //属于则进行更新操作,不属于忽略
            Skill t = skillMapper.selectByPrimaryKey(skill.getId());
            if(t != null && t.getUserId().equals(skill.getUserId())){
                skillMapper.updateByPrimaryKeySelective(skill);
            }
        }
    }

    @Override
    public void delete(int id, int userId) {
        skillMapper.delete(id, userId);
    }


}
