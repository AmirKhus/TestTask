package com.example.demo.service.iml;

import com.example.demo.entity.InformationForUser;
import com.example.demo.entity.Post;
import com.example.demo.entity.Users;
import com.example.demo.repository.InformationForUserRepository;
import com.example.demo.resource.InformationForUserResource;
import com.example.demo.service.PostService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InformationForUserService{
    @Autowired
    InformationForUserRepository informationForUserRepository;
    @Autowired
    UserService userService;
    @Autowired
    PostService postService;

    public List<InformationForUserResource> getAll() {
        List<InformationForUserResource> informationForUserResources = new ArrayList<>();
        List<InformationForUser> information= informationForUserRepository.findAll();
        for (InformationForUser inf :
                information) {
            Users users = userService.getUserById(inf.getUserId());
            Post post = postService.getById(inf.getPostId());
            informationForUserResources.add(new InformationForUserResource(users.getId(),users.getFio(),
                    users.getBirthday(),users.getEmail(),users.getPhoneNumber(),post.getName()));
        }
        return informationForUserResources;
    }
}
