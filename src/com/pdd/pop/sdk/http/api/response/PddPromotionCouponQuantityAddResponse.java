package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddPromotionCouponQuantityAddResponse extends PopBaseHttpResponse{

    /**
     * 增加优惠券发行数量响应对象
     */
    @JsonProperty("coupon_quantity_add_response")
    private CouponQuantityAddResponse couponQuantityAddResponse;

    
    public CouponQuantityAddResponse getCouponQuantityAddResponse() {
        return couponQuantityAddResponse;
    }

    
    public static class CouponQuantityAddResponse {

        /**
         * 是否增加成功，true-成功，false-失败
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}