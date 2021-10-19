package com.example.userservice.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Id
    private Long id;

    @Column(nullable = false , length = 50, unique = true)
    private String email;
    @Column(nullable = false , length = 50)
    private String name;
    @Column(nullable = false , unique = true)
    private String userId;
    @Column(nullable = false , unique = true)
    private String encryptedPwd;

}