package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsSpecIdGetResponse extends PopBaseHttpResponse{

    /**
     * 生成规格响应对象
     */
    @JsonProperty("goods_spec_id_get_response")
    private GoodsSpecIdGetResponse goodsSpecIdGetResponse;

    
    public GoodsSpecIdGetResponse getGoodsSpecIdGetResponse() {
        return goodsSpecIdGetResponse;
    }

    
    public static class GoodsSpecIdGetResponse {

        /**
         * 自定义规格所属的规格ID
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 生成的自定义规格名称
         */
        @JsonProperty("spec_name")
        private String specName;

        /**
         * 生成的自定义规格ID
         */
        @JsonProperty("spec_id")
        private Long specId;

        
        public Long getParentSpecId() {
            return parentSpecId;
        }

        public String getSpecName() {
            return specName;
        }

        public Long getSpecId() {
            return specId;
        }

        
    }
    
}