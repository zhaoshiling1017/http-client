package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddPromotionHomeCouponCreateResponse extends PopBaseHttpResponse{

    /**
     * 创建店铺首页优惠券批次对象
     */
    @JsonProperty("home_coupon_batch_create_response")
    private HomeCouponBatchCreateResponse homeCouponBatchCreateResponse;

    
    public HomeCouponBatchCreateResponse getHomeCouponBatchCreateResponse() {
        return homeCouponBatchCreateResponse;
    }

    
    public static class HomeCouponBatchCreateResponse {

        /**
         * 批次id
         */
        @JsonProperty("batch_id")
        private Long batchId;

        
        public Long getBatchId() {
            return batchId;
        }

        
    }
    
}