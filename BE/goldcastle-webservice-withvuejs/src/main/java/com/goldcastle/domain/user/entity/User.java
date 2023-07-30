package com.goldcastle.domain.user.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name = "uid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
}
