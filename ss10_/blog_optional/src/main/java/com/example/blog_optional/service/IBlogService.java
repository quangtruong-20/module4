package com.example.blog_optional.service;

import com.example.blog_optional.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> getAll(String name, Pageable pageable);

    Blog getByID(int id);


}
