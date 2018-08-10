package com.web.freemarker.demo.service.impl;

import com.web.freemarker.demo.entity.Job;
import com.web.freemarker.demo.mapper.JobMapper;
import com.web.freemarker.demo.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Resource
    private JobMapper jobMapper;
    @Override
    public List<Job> listByUserId(int userId) {
        return jobMapper.listByUserId(userId);
    }

    @Override
    public void update(Job job) {
        if(job.getId() == null){
            jobMapper.insert(job);
        }else{
            //判断当前数据是否属于当前登录用户
            //属于则进行更新操作,不属于忽略
            Job t = jobMapper.selectByPrimaryKey(job.getId());
            if(t != null && t.getUserId().equals(job.getUserId())){
                jobMapper.updateByPrimaryKeySelective(job);
            }
        }
    }

    @Override
    public void delete(int id, int userId) {
        jobMapper.deleteByIdAndUserId(id, userId);
    }

}
