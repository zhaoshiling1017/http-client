package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddPromotionCouponCloseResponse extends PopBaseHttpResponse{

    /**
     * 关闭批次接口响应对象
     */
    @JsonProperty("promotion_coupon_batch_close_response")
    private PromotionCouponBatchCloseResponse promotionCouponBatchCloseResponse;

    
    public PromotionCouponBatchCloseResponse getPromotionCouponBatchCloseResponse() {
        return promotionCouponBatchCloseResponse;
    }

    
    public static class PromotionCouponBatchCloseResponse {

        /**
         * 是否关闭成功，true-成功，false-失败
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}