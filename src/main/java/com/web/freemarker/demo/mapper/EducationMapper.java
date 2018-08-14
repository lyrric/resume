package com.web.freemarker.demo.mapper;

import com.web.freemarker.demo.entity.Credential;
import com.web.freemarker.demo.entity.Education;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface EducationMapper extends BaseMapper<Education> {

    @Select("select * from education where user_id = #{userId}")
    @ResultMap("BaseResultMap")
    List<Education> listByUserId(@Param("userId") int userId);

    @Select("select * from education where user_id = #{userId} and id = #{id}")
    @ResultMap("BaseResultMap")
    Education findByIdAndUserId(@Param("id")int id, @Param("userId") int userId);

    @Update("update education set college = #{college}," +
            "startDate = #{startDate}," +
            "endDate = #{endDate}," +
            "specialty = #{specialty}," +
            "type = #{type}," +
            "courses = #{courses} " +
            "where id = #{id} and user_id = #{userId}")
    int update(Education education);

    @Delete("deleteByIdAndUserId from education where id = #{id} and user_id = #{userId}")
    int deleteByIdAndUserId(@Param("id")Integer id, @Param("userId")Integer userId);

}