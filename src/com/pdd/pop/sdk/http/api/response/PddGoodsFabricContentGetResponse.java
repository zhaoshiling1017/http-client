package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsFabricContentGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_fabric_content_get_response")
    private GoodsFabricContentGetResponse goodsFabricContentGetResponse;

    
    public GoodsFabricContentGetResponse getGoodsFabricContentGetResponse() {
        return goodsFabricContentGetResponse;
    }

    
    public static class GoodsFabricContentGetResponse {

        /**
         * 服饰成分含量对象列表
         */
        @JsonProperty("goods_fabric_content_list")
        private List<GoodsFabricContentListItem> goodsFabricContentList;

        
        public List<GoodsFabricContentListItem> getGoodsFabricContentList() {
            return goodsFabricContentList;
        }

        
    }
    public static class GoodsFabricContentListItem {

        /**
         * 服饰成分含量 对应的ID，用于入参
         */
        @JsonProperty("code")
        private Long code;

        /**
         * 对应ID下的服饰成分含量描述
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