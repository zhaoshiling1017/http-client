package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkOauthZsUnitGoodsQueryResponse extends PopBaseHttpResponse{

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
        private List<ListItem> list;

        
        public Integer getTotalCount() {
            return totalCount;
        }

        public List<ListItem> getList() {
            return list;
        }

        
    }
    public static class ListItem {

        /**
         * coupon_total_quantity
         */
        @JsonProperty("coupon_total_quantity")
        private Long couponTotalQuantity;

        
        public Long getCouponTotalQuantity() {
            return couponTotalQuantity;
        }

        
    }
    
}