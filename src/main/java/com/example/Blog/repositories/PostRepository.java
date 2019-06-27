package com.example.Blog.repositories;

import com.example.Blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;


//it is extending the JPA repo interface to make it work with the post class of entity  which we created before.
//its going to use a Long as its identifier which is what we created below.

public interface PostRepository extends JpaRepository<Post,Long> {
    
}
