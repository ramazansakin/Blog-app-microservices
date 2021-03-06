package com.sakinramazan.microservices.blogservice.service;

import com.sakinramazan.microservices.blogservice.entity.Blog;
import com.sakinramazan.microservices.blogservice.entity.Post;

import java.util.List;

public interface BlogService {

    // CRUD ops
    List<Blog> getAllBlogs();

    Blog getBlog(Integer id);

    Blog createBlog(Blog blog);

    Blog updateBlog(Blog blog);

    boolean deleteBlog(Integer id);

    List<Post> getAllPostOf(Integer id);

    Post addNewPost(Post post, Integer id);

    List<Post> getAllPosts();
}
