package com.goldcastle.domain.admin.entity;

import javax.persistence.*;

@Entity
public class UsageHistory {

    @Id
    @Column(name = "usid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usid;
}
