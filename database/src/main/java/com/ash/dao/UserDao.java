package com.ash.dao;


import com.ash.model.User;

import java.util.List;

public class UserDao {
    public List<User> findAll() {
        return List.of(
                new User(12,"Ivan"),
                new User(22,"Petr"),
                new User(33,"Sveta")
        );
    }
}
