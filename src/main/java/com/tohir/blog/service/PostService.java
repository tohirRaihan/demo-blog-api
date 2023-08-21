package com.tohir.blog.service;

import java.util.List;

import com.tohir.blog.payload.PostDto;

public interface PostService {
    
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

}
