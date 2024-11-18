package kg.alatoo.blog_api.service;

import kg.alatoo.blog_api.entities.PostEntity;

import java.util.List;

public interface PostService {

    PostEntity savePostEntity(PostEntity postEntity);

    List<PostEntity> getAllPosts();

    PostEntity getPostEntityById(Long postId);

    List<PostEntity> searchByName(String name);

}
