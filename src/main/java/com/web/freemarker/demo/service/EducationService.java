package com.web.freemarker.demo.service;

import com.web.freemarker.demo.entity.Education;

import java.util.List;

public interface EducationService {

    List<Education> listByUserId(int userId);

    void update(Education education);

    void delete(int id, int userId);

    Education findByIdAndUserId(int id, int userId);
}
