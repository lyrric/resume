package com.web.freemarker.demo.mapper;

import com.github.pagehelper.Page;
import com.web.freemarker.demo.entity.ResumeTpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ResumeTplMapper {

    @Select("select * from resume_tpl")
    @ResultMap("BaseResultMap")
    Page<ResumeTpl> page();
}