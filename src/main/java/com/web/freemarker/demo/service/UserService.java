package com.web.freemarker.demo.service;

import com.web.freemarker.demo.entity.User;

public interface UserService {

    User findById(int id);

    void update(User user);
}
