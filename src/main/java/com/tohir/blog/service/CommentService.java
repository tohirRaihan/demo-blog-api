package com.tohir.blog.service;

import java.util.List;

import com.tohir.blog.payload.CommentDto;

public interface CommentService {
    
    CommentDto createComment(Long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(Long postId);
}
