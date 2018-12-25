package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddStockGoodsIdToSkuQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    
    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponse {

        /**
         * 总数
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * sku信息
         */
        @JsonProperty("skus")
        private List<SkusItem> skus;

        
        public Integer getTotal() {
            return total;
        }

        public List<SkusItem> getSkus() {
            return skus;
        }

        
    }
    public static class SkusItem {

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * sku_id
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        /**
         * 是否已经绑定货品false/true
         */
        @JsonProperty("exist_ware")
        private Boolean existWare;

        /**
         * 上下架状态，true表示上架，false表示下架
         */
        @JsonProperty("is_onsale")
        private Boolean isOnsale;

        /**
         * 规格信息
         */
        @JsonProperty("specs")
        private List<SpecsItem> specs;

        
        public Long getGoodsId() {
            return goodsId;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Long getWareId() {
            return wareId;
        }

        public Boolean getExistWare() {
            return existWare;
        }

        public Boolean getIsOnsale() {
            return isOnsale;
        }

        public List<SpecsItem> getSpecs() {
            return specs;
        }

        
    }
    public static class SpecsItem {

        /**
         * 规格id
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 规格名称
         */
        @JsonProperty("spec_key")
        private String specKey;

        /**
         * 规格值
         */
        @JsonProperty("spec_value")
        private String specValue;

        
        public Long getSpecId() {
            return specId;
        }

        public String getSpecKey() {
            return specKey;
        }

        public String getSpecValue() {
            return specValue;
        }

        
    }
    
}