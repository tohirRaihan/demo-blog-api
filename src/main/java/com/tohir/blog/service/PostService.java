package com.tohir.blog.service;

import com.tohir.blog.payload.PostDto;
import com.tohir.blog.payload.PostResponse;

public interface PostService {
    
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize);

    PostDto getPostById(Long id);

    PostDto updatePost( PostDto postDto, Long id);

    void deletePostById(Long id);

}
