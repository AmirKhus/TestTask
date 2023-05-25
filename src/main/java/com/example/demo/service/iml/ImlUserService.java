package com.example.demo.service.iml;

import com.example.demo.entity.InformationForUser;
import com.example.demo.entity.Users;
import com.example.demo.repository.InformationForUserRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ImlUserService implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    InformationForUserRepository informationForUserRepository;


    @Override
    public void save(Users users) {
        userRepository.save(users);
        informationForUserRepository.save(new InformationForUser(users.getId(), users.getPostId()));
    }


    public void update(Users users) {
        userRepository.save(users);
        informationForUserRepository.save(informationForUserRepository.findByUserId(users.getId()));
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    public Users getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Users> getUserByBirthday(Date date) {
        return userRepository.findOrderByBirthday(date);
    }

    public List<Users> getUserByPostId(Long postId) {
        return userRepository.findOrOrderByPostId(postId);
    }
}
