package com.example.demo.service;

import com.example.demo.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    void save(Post post);

    void delete(long id);

    List<Post> getAll();

    Post getById(Long id);
}
