package com.tohir.blog.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.tohir.blog.entity.Post;
import com.tohir.blog.payload.PostDto;

@Mapper
public interface PostMapper {

    PostMapper MAPPER = Mappers.getMapper(PostMapper.class);
    
    @Mapping(target = "categoryId", source = "post.category.id")
    PostDto mapToPostDto(Post post);

    Post mapToPost(PostDto postDto);
}
