package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkZsUnitGoodsQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("zs_unit_goods_query_response")
    private ZsUnitGoodsQueryResponse zsUnitGoodsQueryResponse;

    
    public ZsUnitGoodsQueryResponse getZsUnitGoodsQueryResponse() {
        return zsUnitGoodsQueryResponse;
    }

    
    public static class ZsUnitGoodsQueryResponse {

        /**
         * 请求到的结果数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        /**
         * 列表
         */
        @JsonProperty("list")
        private List<String> list;

        
        public Integer getTotalCount() {
            return totalCount;
        }

        public List<String> getList() {
            return list;
        }

        
    }
    
}