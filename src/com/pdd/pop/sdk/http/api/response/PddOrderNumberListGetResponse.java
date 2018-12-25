package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderNumberListGetResponse extends PopBaseHttpResponse{

    /**
     * 订单全量列表响应对象
     */
    @JsonProperty("order_sn_list_get_response")
    private OrderSnListGetResponse orderSnListGetResponse;

    
    public OrderSnListGetResponse getOrderSnListGetResponse() {
        return orderSnListGetResponse;
    }

    
    public static class OrderSnListGetResponse {

        /**
         * 订单全量列表对象
         */
        @JsonProperty("order_sn_list")
        private List<OrderSnListItem> orderSnList;

        /**
         * 返回的订单总数，至多返回近90天的订单
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        
        public List<OrderSnListItem> getOrderSnList() {
            return orderSnList;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        
    }
    public static class OrderSnListItem {

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        
        public String getOrderSn() {
            return orderSn;
        }

        
    }
    
}