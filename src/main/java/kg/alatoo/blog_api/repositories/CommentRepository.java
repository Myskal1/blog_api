package kg.alatoo.blog_api.repositories;

import kg.alatoo.blog_api.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    List<CommentEntity> findByPostEntityId(Long postId);

}
