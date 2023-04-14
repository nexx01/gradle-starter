package com.ash.service;

import com.ash.dao.UserDao;
import com.ash.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserService userService=new UserService();

    @Test
    void name() {
        var all = userService.getAll();
        assertEquals(3,all.size());
    }
}