package com.tohir.blog.service;

import com.tohir.blog.payload.CommentDto;

public interface CommentService {
    
    CommentDto createComment(Long postId, CommentDto commentDto);
    
}
