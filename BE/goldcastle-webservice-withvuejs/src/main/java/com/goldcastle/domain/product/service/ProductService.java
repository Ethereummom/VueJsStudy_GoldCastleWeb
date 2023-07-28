package com.goldcastle.domain.product.service;

import com.goldcastle.domain.product.dto.ProductPaginationRequestDTO;
import com.goldcastle.domain.product.dto.ProductResponseDTO;
import com.goldcastle.domain.product.entity.Product;
import com.goldcastle.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public Page<ProductResponseDTO>showProductDetails(Long pid, ProductPaginationRequestDTO requestDTO){
        Pageable pageable = PageRequest.of(requestDTO.getPage(),requestDTO.getLimit());
        Optional<Product> result = productRepository.findByPid(pid);

        if(result.isPresent()){
            productinfo =
        }
    }



    public ProductResponseDTO entityToDto(Product product){
        return ProductResponseDTO.builder()
                .pid(product.getPid())
                .pcategory(product.getPcategory())
                .pname(product.getPname())
                .pcontent(product.getPcontent())
                .pphoto(product.getPphoto())
                .pprice(product.getPprice())
                .psuitablesex(product.getPsuitablesex())
                .build();
    }
}
