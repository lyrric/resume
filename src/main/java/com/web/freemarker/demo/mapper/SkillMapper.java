package com.web.freemarker.demo.mapper;

import com.web.freemarker.demo.entity.Project;
import com.web.freemarker.demo.entity.Skill;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface SkillMapper extends BaseMapper<Skill> {

    @Select("select * from skill where user_id = #{userId}")
    @ResultMap("BaseResultMap")
    List<Skill> listByUserId(@Param("userId") int userId);

    @Select("select * from skill where user_id = #{userId} and id = #{id}")
    @ResultMap("BaseResultMap")
    Skill findByIdAndUserId(@Param("id")int id, @Param("userId") int userId);

    @Update("update skill set name = #{name}," +
            "experience = #{experience} " +
            "where id = #{id} and user_id = #{userId}")
    int update(Skill skill);

    @Delete("deleteByIdAndUserId from skill where id = #{id} and user_id = #{userId}")
    int deleteByIdAndUserId(@Param("id")Integer id, @Param("userId")Integer userId);
}