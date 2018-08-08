package com.web.freemarker.demo.service;

import com.web.freemarker.demo.entity.Skill;

import java.util.List;

public interface SkillService {

    List<Skill> listByUserId(int userId);

    void update(Skill skill);

    void delete(int id, int userId);
}
