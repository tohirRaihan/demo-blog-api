package com.tohir.blog.payload;

import java.util.Set;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class PostDto {
    
    private Long id;

    @NotEmpty
    private String title;
    
    private String description;
    private String content;
    private Set<CommentDto> comments;

}
