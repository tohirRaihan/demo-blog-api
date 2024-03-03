package com.tohir.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tohir.blog.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
