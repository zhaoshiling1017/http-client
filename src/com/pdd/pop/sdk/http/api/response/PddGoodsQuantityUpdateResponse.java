package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsQuantityUpdateResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_quantity_update_response")
    private GoodsQuantityUpdateResponse goodsQuantityUpdateResponse;

    
    public GoodsQuantityUpdateResponse getGoodsQuantityUpdateResponse() {
        return goodsQuantityUpdateResponse;
    }

    
    public static class GoodsQuantityUpdateResponse {

        /**
         * true
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}