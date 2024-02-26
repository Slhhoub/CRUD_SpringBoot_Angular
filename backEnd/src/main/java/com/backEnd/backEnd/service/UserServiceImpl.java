package com.backEnd.backEnd.service;

import com.backEnd.backEnd.model.entity.User;
import com.backEnd.backEnd.repository.UserREpository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserREpository userREpository;
    @Override
    public  List<User> getAllUser() {
        return userREpository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        User user = userREpository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
         userREpository.deleteById(id);
    }

    @Override
    public User createUser(User user) {
        return userREpository.save(user);
    }
}
