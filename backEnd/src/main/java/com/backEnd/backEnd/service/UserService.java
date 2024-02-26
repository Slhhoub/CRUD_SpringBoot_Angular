package com.backEnd.backEnd.service;

import com.backEnd.backEnd.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {


    List<User> getAllUser();

    User getUserById(Integer id);

    void deleteUser(Integer id);

    User createUser(User user);
}
