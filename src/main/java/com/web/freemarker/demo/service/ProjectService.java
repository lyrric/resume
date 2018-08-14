package com.web.freemarker.demo.service;

import com.web.freemarker.demo.entity.Project;

import java.util.List;

public interface ProjectService {

    List<Project> listByUserId(int userId);

    void update(Project project);

    void delete(int id, int userId);

    Project findByIdAndUserId(int id, int userId);
}
