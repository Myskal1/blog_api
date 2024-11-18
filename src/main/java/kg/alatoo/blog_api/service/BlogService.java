package kg.alatoo.blog_api.service;

import kg.alatoo.blog_api.entities.Blog;

import java.util.List;

public interface BlogService {
    Blog createBlog(Blog blog);
    List<Blog> getAllBlogs();
    Blog getBlogById(Long id);
    Blog updateBlog(Long id, Blog blogDetails);
    void deleteBlog(Long id);
}
