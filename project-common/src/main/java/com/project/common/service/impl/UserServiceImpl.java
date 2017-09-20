package com.project.common.service.impl;

import com.project.common.entity.User;
import com.project.common.repository.UserRepositoryJpa;
import com.project.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryJpa userRepositoryJpa;

    @Override
    public List<User> getUsers() {
        return userRepositoryJpa.getAll();
    }

    @Override
    public void saveUser(User user) {
        userRepositoryJpa.create(user);
    }
}
