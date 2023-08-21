package com.tohir.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tohir.blog.entity.Post;
import com.tohir.blog.payload.PostDto;
import com.tohir.blog.repository.PostRepository;
import com.tohir.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDto createPost(PostDto postDto) {
        // convert DTO to Entity
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post newPost = postRepository.save(post);

        // convert Entity to DTO
        PostDto postResponse = new PostDto();
        postResponse.setId(newPost.getId());
        postResponse.setTitle(newPost.getTitle());
        postResponse.setDescription(newPost.getDescription());
        postResponse.setContent(newPost.getContent());

        return postResponse;
        
    }

    @Override
    public List<PostDto> getAllPosts() {
        // TODO Auto-generated method stub
        return null;
    }

    // Convert Entity to DTO
    private PostDto mapToDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());

        return postDto;

    }
    
}
