package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Users> saveUser(@RequestBody Users user) {
        this.userService.save(user);
        List<Users> users = this.userService.getAll();
        return new ResponseEntity(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Users> deleteUser(@PathVariable(name = "id") Long id) {
        this.userService.delete(id);
        List<Users> users = this.userService.getAll();
        return new ResponseEntity(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Users> updateUser(@RequestBody Users user) {
        this.userService.save(user);
        List<Users> users = this.userService.getAll();
        return new ResponseEntity(users, HttpStatus.OK);
    }
}
