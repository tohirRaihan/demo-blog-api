package com.tohir.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tohir.blog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    
}
