package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsSkuPriceUpdateResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_update_sku_price_response")
    private GoodsUpdateSkuPriceResponse goodsUpdateSkuPriceResponse;

    
    public GoodsUpdateSkuPriceResponse getGoodsUpdateSkuPriceResponse() {
        return goodsUpdateSkuPriceResponse;
    }

    
    public static class GoodsUpdateSkuPriceResponse {

        /**
         * 是否成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}