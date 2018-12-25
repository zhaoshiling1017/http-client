package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderStatusGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("order_status_get_response")
    private OrderStatusGetResponse orderStatusGetResponse;

    
    public OrderStatusGetResponse getOrderStatusGetResponse() {
        return orderStatusGetResponse;
    }

    
    public static class OrderStatusGetResponse {

        /**
         * 订单状态列表对象
         */
        @JsonProperty("order_status_list")
        private List<OrderStatusListItem> orderStatusList;

        
        public List<OrderStatusListItem> getOrderStatusList() {
            return orderStatusList;
        }

        
    }
    public static class OrderStatusListItem {

        /**
         * 订单编号
         */
        @JsonProperty("orderSn")
        private String ordersn;

        /**
         * 订单发货状态，1：待发货，2：已发货待签收，3：已签收 0：异常
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 订单售后状态，1：无售后或售后关闭，2：售后处理中，3：退款中，4：退款成功，0：异常
         */
        @JsonProperty("refund_status")
        private Integer refundStatus;

        
        public String getOrdersn() {
            return ordersn;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public Integer getRefundStatus() {
            return refundStatus;
        }

        
    }
    
}