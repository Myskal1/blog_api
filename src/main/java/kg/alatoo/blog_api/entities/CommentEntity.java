package kg.alatoo.blog_api.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private Date createdAt;

    private String postedBy;

    @ManyToOne
    @JoinColumn(name = "postId", nullable = false)
    private PostEntity postEntity;

}
