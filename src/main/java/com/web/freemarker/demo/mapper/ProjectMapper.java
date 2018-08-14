package com.web.freemarker.demo.mapper;

import com.web.freemarker.demo.entity.Job;
import com.web.freemarker.demo.entity.Project;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface ProjectMapper extends BaseMapper<Project> {

    @Select("select * from project where user_id = #{userId}")
    @ResultMap("BaseResultMap")
    List<Project> listByUserId(@Param("userId") int userId);

    @Select("select * from project where user_id = #{userId} and id = #{id}")
    @ResultMap("BaseResultMap")
    Project findByIdAndUserId(@Param("id")int id, @Param("userId") int userId);

    @Update("update project set name = #{name}," +
            "startDate = #{startDate}," +
            "endDate = #{endDate}," +
            "description = #{description} " +
            "where id = #{id} and user_id = #{userId}")
    int update(Project project);

    @Delete("deleteByIdAndUserId from project where id = #{id} and user_id = #{userId}")
    int deleteByIdAndUserId(@Param("id")Integer id, @Param("userId")Integer userId);

}