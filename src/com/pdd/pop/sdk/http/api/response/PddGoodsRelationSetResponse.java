package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsRelationSetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_relation_set_response")
    private GoodsRelationSetResponse goodsRelationSetResponse;

    
    public GoodsRelationSetResponse getGoodsRelationSetResponse() {
        return goodsRelationSetResponse;
    }

    
    public static class GoodsRelationSetResponse {

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