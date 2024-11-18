package kg.alatoo.blog_api.service;

import jakarta.persistence.EntityNotFoundException;
import kg.alatoo.blog_api.entities.CommentEntity;
import kg.alatoo.blog_api.entities.PostEntity;
import kg.alatoo.blog_api.exception.ResourceNotFoundException;
import kg.alatoo.blog_api.repositories.CommentRepository;
import kg.alatoo.blog_api.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    public CommentEntity createCommentEntity(Long postId, String postedBy, String content){
        Optional<PostEntity> optionalPostEntity = postRepository.findById(postId);
        if (optionalPostEntity.isPresent()){
            CommentEntity commentEntity = new CommentEntity();

            commentEntity.setPostEntity(optionalPostEntity.get());
            commentEntity.setContent((content));
            commentEntity.setPostedBy(postedBy);
            commentEntity.setCreatedAt(new Date());

            return commentRepository.save(commentEntity);
        }
        throw new EntityNotFoundException("Post not found");
    }

    public List<CommentEntity> getCommentsByPostId(Long postId){
        return commentRepository.findByPostEntityId(postId);
    }

    @Override
    public void deleteCommentById(Long commentId) {
        if (!commentRepository.existsById(commentId)) {
            throw new ResourceNotFoundException("Comment not found with ID: " + commentId);
        }
        commentRepository.deleteById(commentId);
    }
}
