package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddRefundStatusCheckResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("refund_status_check_response")
    private RefundStatusCheckResponse refundStatusCheckResponse;

    
    public RefundStatusCheckResponse getRefundStatusCheckResponse() {
        return refundStatusCheckResponse;
    }

    
    public static class RefundStatusCheckResponse {

        /**
         * 存在售后的订单
         */
        @JsonProperty("order_sns_exists_refund")
        private List<OrderSnsExistsRefundItem> orderSnsExistsRefund;

        
        public List<OrderSnsExistsRefundItem> getOrderSnsExistsRefund() {
            return orderSnsExistsRefund;
        }

        
    }
    public static class OrderSnsExistsRefundItem {

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