package com.maven.services.Impl;

import com.maven.entities.User;
import com.maven.services.UserService;
import lombok.Data;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Component
@Data
public class UserServiceImpl implements UserService {
    private HibernateTemplate hibernateTemplatel;

    @Override
    public Serializable addUser(User user) {
        return hibernateTemplatel.save(user);
    }

    @Override
    public User selectUser(User user) {
        return hibernateTemplatel.get(User.class,user.getUserID());
    }

    @Override
    public List<User> selectAllUser(User user) {
        List<User> users = hibernateTemplatel.loadAll(User.class);
        return users;
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        hibernateTemplatel.delete(user);
    }


}
