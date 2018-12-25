package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsFabricGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_fabric_get_response")
    private GoodsFabricGetResponse goodsFabricGetResponse;

    
    public GoodsFabricGetResponse getGoodsFabricGetResponse() {
        return goodsFabricGetResponse;
    }

    
    public static class GoodsFabricGetResponse {

        /**
         * 服饰面料对象列表
         */
        @JsonProperty("goods_fabric_list")
        private List<GoodsFabricListItem> goodsFabricList;

        
        public List<GoodsFabricListItem> getGoodsFabricList() {
            return goodsFabricList;
        }

        
    }
    public static class GoodsFabricListItem {

        /**
         * 服饰面料对应的ID，用于入参
         */
        @JsonProperty("code")
        private Long code;

        /**
         * 对应ID下的服饰面料描述
         */
        @JsonProperty("desc")
        private String desc;

        
        public Long getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

        
    }
    
}