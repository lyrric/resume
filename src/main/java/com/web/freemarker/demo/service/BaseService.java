package com.web.freemarker.demo.service;

import com.web.freemarker.demo.entity.Credential;

public interface BaseService<T> {

    void update(T t);

    void delete(int id, int userId);


    void select(T t);
}
