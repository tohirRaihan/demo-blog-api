package com.tohir.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tohir.blog.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    
    List<Comment> findByPostId(Long postId);
    
}
