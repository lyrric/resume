package com.web.freemarker.demo.mapper;

import com.web.freemarker.demo.entity.Credential;
import com.web.freemarker.demo.entity.Education;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface CredentialMapper extends BaseMapper<Credential> {

    @Select("select * from credential where user_id = #{userId}")
    @ResultMap("BaseResultMap")
    List<Credential> listByUserId(@Param("userId") int userId);

    @Update("update credential set content = #{content} where id = #{id} and user_id = #{userId}")
    int update(Credential credential);

    @Delete("delete from credential where id = #{id} and user_id = #{userId}")
    int delete(@Param("id")Integer id, @Param("userId")Integer userId);
}