package com.goldcastle.domain.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Schema(description = "상품 전체 조회 응답 dto")
@Getter
@Builder
public class ProductResponseDTO {

    private Long pid;
    private String pcategory;
    private String pname;
    private String pcontent;
    private String pphoto;
    private String pprice;
    private String psuitablesex;
    private String ppopularity;

}
