package com.goldcastle.domain.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter
@Schema(description = "상품 조회 요청 DTO")
public class ProductPaginationRequestDTO {

    @Schema(description = "page number")
    private Integer page;

    @Schema(description = "number of products which in one page")
    private Integer limit;

    @Builder
    private ProductPaginationRequestDTO(Integer page, Integer limit){
        this.page = page == null ? 0 : page;
        this.limit = limit == null ? 10 : limit;
    }

}
