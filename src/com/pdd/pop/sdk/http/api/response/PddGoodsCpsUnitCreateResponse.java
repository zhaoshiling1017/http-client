package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCpsUnitCreateResponse extends PopBaseHttpResponse{

    /**
     * 失败原因列表对象，创建成功则此参数为空
     */
    @JsonProperty("failed_vos")
    private List<FailedVosItem> failedVos;

    
    public List<FailedVosItem> getFailedVos() {
        return failedVos;
    }

    
    public static class FailedVosItem {

        /**
         * 创建失败的商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 创建失败原因
         */
        @JsonProperty("reason")
        private String reason;

        
        public Long getGoodsId() {
            return goodsId;
        }

        public String getReason() {
            return reason;
        }

        
    }
    
}