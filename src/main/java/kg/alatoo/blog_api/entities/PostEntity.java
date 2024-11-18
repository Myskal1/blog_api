package kg.alatoo.blog_api.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

    private String name;

    @Column(length = 5000)
    private String content;

    private String postedBy;

    private String img;

    private Date date;

    private int likeCount;

    private int viewCount;

    private List<String> tags;




}
