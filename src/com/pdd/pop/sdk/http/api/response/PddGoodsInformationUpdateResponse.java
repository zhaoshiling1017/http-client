package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsInformationUpdateResponse extends PopBaseHttpResponse{

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
         * 提交申请的序列id
         */
        @JsonProperty("goods_commit_id")
        private Long goodsCommitId;

        /**
         * 是否修改成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Long getGoodsCommitId() {
            return goodsCommitId;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}