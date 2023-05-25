package com.example.demo.service;

import com.example.demo.entity.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(Users users);

    void delete(long id);

    List<Users> getAll();

    Users getUserById(Long id);

}
