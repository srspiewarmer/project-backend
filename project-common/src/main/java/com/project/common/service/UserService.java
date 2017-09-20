package com.project.common.service;

import com.project.common.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void saveUser(User user);
}
