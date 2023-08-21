package com.tohir.blog.service;

import com.tohir.blog.payload.PostDto;

public interface PostService {
    
    PostDto createPost(PostDto postDto);
    
}
