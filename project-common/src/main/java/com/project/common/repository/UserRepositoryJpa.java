package com.project.common.repository;

import com.project.common.abstracts.BaseJpaAbstract;
import com.project.common.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryJpa extends BaseJpaAbstract<User> {

    @Override
    public Class getEntityClass() {
        return User.class;
    }
}
