package kg.alatoo.blog_api.service;

import jakarta.persistence.EntityNotFoundException;
import kg.alatoo.blog_api.entities.PostEntity;
import kg.alatoo.blog_api.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public PostEntity savePostEntity(PostEntity postEntity) {
        postEntity.setLikeCount(0);
        postEntity.setViewCount(0);
        postEntity.setDate(new Date());

        return postRepository.save(postEntity);
    }

    @Override
    public List<PostEntity> getAllPosts() {
        return postRepository.findAll();
    }

    public PostEntity getPostEntityById(Long postId){
        Optional<PostEntity> optionalPost = postRepository.findById(postId);
        if (optionalPost.isPresent()){
            PostEntity postEntity = optionalPost.get();
            postEntity.setViewCount((postEntity.getViewCount() + 1));
            return postRepository.save(postEntity);
        }else{
            throw new EntityNotFoundException("Post not found");
        }
    }

    public List<PostEntity> searchByName(String name){
        return postRepository.findAllByNameContaining(name);
    }

   

}
