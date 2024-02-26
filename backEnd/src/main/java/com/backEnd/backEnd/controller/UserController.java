package com.backEnd.backEnd.controller;

import com.backEnd.backEnd.model.entity.User;
import com.backEnd.backEnd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    ResponseEntity<List<User> > allUser(){
        List<User> users = userService.getAllUser();
        return  new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("{id}")
    ResponseEntity<User>  getUserById(@PathVariable("id") Integer id){
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user,HttpStatus.FOUND);
    }

    @PostMapping("/create")
    ResponseEntity<User> createUser(@RequestBody User user){
        User adduser = userService.createUser(user);
        return  new ResponseEntity<>(adduser, HttpStatus.CREATED);
    }



    @DeleteMapping("{id}")
    ResponseEntity<Void> deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return  ResponseEntity.noContent().build();
    }

}
