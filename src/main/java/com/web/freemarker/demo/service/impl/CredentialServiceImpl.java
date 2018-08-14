package com.web.freemarker.demo.service.impl;

import com.web.freemarker.demo.entity.Credential;
import com.web.freemarker.demo.mapper.CredentialMapper;
import com.web.freemarker.demo.service.CredentialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CredentialServiceImpl implements CredentialService {

    @Resource
    private CredentialMapper credentialMapper;

    @Override
    public List<Credential> listByUserId(int userId) {
        return credentialMapper.listByUserId(userId);
    }

    @Override
    public void update(Credential credential) {
        if(credential.getId() == null){
            credentialMapper.insert(credential);
        }else{
            //判断当前数据是否属于当前登录用户
            //属于则进行更新操作,不属于忽略
            Credential t = credentialMapper.selectByPrimaryKey(credential.getId());
            if(t != null && t.getUserId().equals(credential.getUserId())){
                credentialMapper.updateByPrimaryKeySelective(credential);
            }
        }
    }

    @Override
    public void delete(int id, int userId) {
        credentialMapper.deleteByIdAndUserId(id, userId);
    }


}
