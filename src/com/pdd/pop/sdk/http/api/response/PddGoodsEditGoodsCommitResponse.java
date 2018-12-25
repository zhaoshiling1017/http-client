package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsEditGoodsCommitResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_update_response")
    private GoodsUpdateResponse goodsUpdateResponse;

    
    public GoodsUpdateResponse getGoodsUpdateResponse() {
        return goodsUpdateResponse;
    }

    
    public static class GoodsUpdateResponse {

        /**
         * 草稿id
         */
        @JsonProperty("goods_commit_id")
        private Long goodsCommitId;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        
        public Long getGoodsCommitId() {
            return goodsCommitId;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        
    }
    
}