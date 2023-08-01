package com.goldcastle.domain.product.controller;

import com.goldcastle.domain.product.dto.ProductPaginationRequestDTO;
import com.goldcastle.domain.product.dto.ProductResponseDTO;
import com.goldcastle.domain.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    //전체 상품
    @GetMapping("/products")
    public Page<ProductResponseDTO> listProduct(@ModelAttribute ProductPaginationRequestDTO requestDTO){

        return productService.showAllProducts(requestDTO);
    }

    //@GetMapping("/products/")

    //상품 상세정보보기
    @GetMapping("/products/{pid}")
    public ProductResponseDTO detailProduct(@PathVariable Long pid){
        System.out.println("상품아이디 " + pid);
        return productService.showProductDetails(pid);
    }

    //특정 순으로 소팅하기
    @GetMapping("/products/sorted")
    public ResponseEntity<List<ProductResponseDTO>>listProductBySorted(){
        return null;
    }

}
