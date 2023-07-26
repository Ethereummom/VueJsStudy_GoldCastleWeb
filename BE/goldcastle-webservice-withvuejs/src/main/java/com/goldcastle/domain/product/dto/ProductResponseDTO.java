package com.goldcastle.domain.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
@Schema(description = "상품 전체 조회 응답 dto")
@Getter
public class ProductResponseDTO {
    private Long pid;
    private String category;
    private String photo;
    private String price;
    private String suitablesex;
    private Integer popularity;

}
