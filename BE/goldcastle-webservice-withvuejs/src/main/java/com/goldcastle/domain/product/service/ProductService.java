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

    public Page<ProductResponseDTO> showAllProducts(ProductPaginationRequestDTO dto){
        Pageable pageable = PageRequest.of(dto.getPage() , dto.getLimit());
        return productRepository.findAll(pageable).map(this::entityToDto);

    }

    public ProductResponseDTO showProductDetails(Long pid){
        Optional<Product> result = productRepository.findByPid(pid);

        if(result.isPresent()){
            Product product = result.get();
            ProductResponseDTO productinfo = entityToDto(product);
            System.out.println("상품정보: " + productinfo.getPid());
            return productinfo;
        }else {
            System.out.println("isnull?s");
            return null;
            //throw new ProductNotFoundException("상품이 존재하지 않습니다");
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
