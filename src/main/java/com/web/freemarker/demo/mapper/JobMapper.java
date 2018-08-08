package com.web.freemarker.demo.mapper;

import com.web.freemarker.demo.entity.Education;
import com.web.freemarker.demo.entity.Job;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface JobMapper extends BaseMapper<Job> {

    @Select("select * from job where user_id = #{userId}")
    @ResultMap("BaseResultMap")
    List<Job> listByUserId(@Param("userId") int userId);

    @Update("update job set company = #{company}," +
            "startDate = #{startDate}," +
            "endDate = #{endDate}," +
            "position = #{position}," +
            "description = #{description} " +
            "where id = #{id} and user_id = #{userId}")
    int update(Job job);

    @Delete("delete from job where id = #{id} and user_id = #{userId}")
    int delete(@Param("id")Integer id, @Param("userId")Integer userId);

}