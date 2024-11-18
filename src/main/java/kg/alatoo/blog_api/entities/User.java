package kg.alatoo.blog_api.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "blog_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;

}

