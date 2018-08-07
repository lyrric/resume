package com.web.freemarker.demo.mapper;

import com.web.freemarker.demo.entity.Credential;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface CredentialMapper extends BaseMapper<Credential> {

}