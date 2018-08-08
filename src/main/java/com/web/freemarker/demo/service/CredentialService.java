package com.web.freemarker.demo.service;

import com.web.freemarker.demo.entity.Credential;

import java.util.List;

public interface CredentialService {

    List<Credential> listByUserId(int userId);

    void update(Credential credential);

    void delete(int id, int userId);

}
