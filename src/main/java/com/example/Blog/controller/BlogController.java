package com.example.Blog.controller;


import com.example.Blog.entities.Post;
import com.example.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private PostService postService;

    @GetMapping(value="/")
    public String index() {
        return "index";
    }

//    return a list of posts and it will be mapped to the path /posts.
    @GetMapping(value="/posts")
    public List<Post> posts() {
        return postService.getAllPosts();
    }
}
