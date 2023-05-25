package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.entity.Users;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @RequestMapping(value = "/save/", method = RequestMethod.POST)
    public ResponseEntity<Post> saveUser(@RequestBody Post post) {
        this.postService.save(post);
        List<Post> posts = this.postService.getAll();
        return new ResponseEntity(posts, HttpStatus.OK);
    }
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Post> updateUser(@RequestBody Post post) {
        this.postService.save(post);
        List<Post> posts = this.postService.getAll();
        return new ResponseEntity(posts, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Post> deleteUser(@PathVariable(name = "id") Long id) {
        this.postService.delete(id);
        List<Post> posts = this.postService.getAll();
        return new ResponseEntity(posts, HttpStatus.OK);
    }


}
