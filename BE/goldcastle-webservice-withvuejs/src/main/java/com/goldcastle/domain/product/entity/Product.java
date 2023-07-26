package com.goldcastle.domain.product.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Product {

    @Id
    @Column(name = "pid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Column(name = "pcategory", nullable = false)
    private String pcategory;

    @Column(name = "pphoto", nullable = false)
    private String pphoto;

    @Column(name = "pprice", nullable = true)
    private String pprice;

    @Column(name = "psuitablesex", nullable = true)
    private String psuitablesex;

    @Column(name = "ppopularity", nullable = false)
    private String ppopularity;

}
