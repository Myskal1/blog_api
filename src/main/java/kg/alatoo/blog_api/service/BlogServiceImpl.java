package kg.alatoo.blog_api.service;

import kg.alatoo.blog_api.entities.Blog;
import kg.alatoo.blog_api.exception.ResourceNotFoundException;
import kg.alatoo.blog_api.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog createBlog(Blog blog) {
        blog.setCreatedAt(LocalDateTime.now());
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(Long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Blog not found"));
    }

    @Override
    public Blog updateBlog(Long id, Blog blogDetails) {
        Blog blog = getBlogById(id);
        blog.setTitle(blogDetails.getTitle());
        blog.setDescription(blogDetails.getDescription());
        blog.setUpdatedAt(LocalDateTime.now());
        return blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(Long id) {
        Blog blog = getBlogById(id);
        blogRepository.delete(blog);
    }
}

