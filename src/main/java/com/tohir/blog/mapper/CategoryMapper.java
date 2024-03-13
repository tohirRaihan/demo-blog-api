package com.tohir.blog.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.tohir.blog.entity.Category;
import com.tohir.blog.payload.CategoryDto;

@Mapper
public interface CategoryMapper {

    CategoryMapper MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDto mapToCategoryDto(Category category);
    
}
