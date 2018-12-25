package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsAddResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_add_response")
    private GoodsAddResponse goodsAddResponse;

    
    public GoodsAddResponse getGoodsAddResponse() {
        return goodsAddResponse;
    }

    
    public static class GoodsAddResponse {

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 上传商品的上传序列ID
         */
        @JsonProperty("goods_commit_id")
        private Long goodsCommitId;

        
        public Long getGoodsId() {
            return goodsId;
        }

        public Long getGoodsCommitId() {
            return goodsCommitId;
        }

        
    }
    
}