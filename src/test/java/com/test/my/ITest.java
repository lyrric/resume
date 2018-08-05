package com.test.my;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONWriter;
import com.web.freemarker.demo.Application;
import com.web.freemarker.demo.entity.Credential;
import com.web.freemarker.demo.mapper.CredentialMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ITest {

    @Resource
    private CredentialMapper credentialMapper;
    @Test
    public void DaoTest(){
        Credential credential = credentialMapper.selectByPrimaryKey(1);
        System.out.println(JSONObject.toJSON(credential));
    }

}
