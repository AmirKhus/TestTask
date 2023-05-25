package com.example.demo.service.iml;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ImlPostService implements PostService {
    @Autowired
    PostRepository postRepository;
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    InformationForUserRepository informationForUserRepository;
    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    public void update(Post post) {
        postRepository.save(post);
    }

    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public Post getById(Long id) {
        return postRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public void delete(long id) {
        postRepository.deleteById(id);
    }



}
