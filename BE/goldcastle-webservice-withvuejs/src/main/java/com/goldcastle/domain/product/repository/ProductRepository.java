package com.goldcastle.domain.product.repository;

import com.goldcastle.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByPid(Long pid);
}
