package kg.alatoo.blog_api.service;

import kg.alatoo.blog_api.entities.CommentEntity;

import java.util.List;

public interface CommentService {

    CommentEntity createCommentEntity(Long postId, String postedBy, String content);

    List<CommentEntity> getCommentsByPostId(Long ostId);
}
