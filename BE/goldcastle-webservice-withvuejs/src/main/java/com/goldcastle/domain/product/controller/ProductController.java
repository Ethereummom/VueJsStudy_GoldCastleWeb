package com.goldcastle.domain.product.controller;

import com.goldcastle.domain.product.dto.ProductResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    //전체 상품
    @GetMapping("/products")
    public ResponseEntity<List<ProductResponseDTO>>listProduct(String uid){
        return null;
    }

    //특정 순으로 소팅하기
    @GetMapping("/products/sorted")
    public ResponseEntity<List<ProductResponseDTO>>listProductBySorted(String uid){
        return null;
    }
}
