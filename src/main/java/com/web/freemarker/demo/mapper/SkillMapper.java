package com.web.freemarker.demo.mapper;

import com.web.freemarker.demo.entity.Project;
import com.web.freemarker.demo.entity.Skill;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface SkillMapper extends BaseMapper<Skill> {

    @Select("select * from skill where user_id = #{userId}")
    @ResultMap("BaseResultMap")
    List<Skill> listByUserId(@Param("userId") int userId);
}