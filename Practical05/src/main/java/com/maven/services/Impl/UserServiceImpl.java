package com.maven.services.Impl;

import com.maven.entities.User;
import com.maven.services.UserService;
import lombok.Data;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Data
@Component
public class UserServiceImpl implements UserService {

   private HibernateTemplate hibernateTemplate;


    @Override
    public User createUser(User user) {
        Serializable id = hibernateTemplate.save(user);
        return hibernateTemplate.get(User.class,id);
    }

    @Override
    @Transactional
    public void  updateUser(User user) {
          hibernateTemplate.update(user);
         System.out.println("User Updated..");
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        User user1 = hibernateTemplate.get(User.class, user.getUserID());
        System.out.println(user1);
        System.out.println("User Deleted");
        hibernateTemplate.delete(user1);
    }

    @Override
    public User selectUser(User user) {
        User u = hibernateTemplate.get(User.class, user.getUserID());
        System.out.println(u);
         return u;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> users = hibernateTemplate.loadAll(User.class);
        System.out.println(users);
        return users;
    }
}