package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsSubmitGoodsCommitResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("goods_update_response")
    private GoodsUpdateResponse goodsUpdateResponse;

    
    public GoodsUpdateResponse getGoodsUpdateResponse() {
        return goodsUpdateResponse;
    }

    
    public static class GoodsUpdateResponse {

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 提交申请的序列id
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