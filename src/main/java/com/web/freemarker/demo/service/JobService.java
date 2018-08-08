package com.web.freemarker.demo.service;

import com.web.freemarker.demo.entity.Job;

import java.util.List;

public interface JobService {

    List<Job> listByUserId(int userId);

    void update(Job job);

    void delete(int id, int userId);
}
