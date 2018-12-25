package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddVirtualMobileChargeNotifyResponse extends PopBaseHttpResponse{

    /**
     * 虚拟充值回调通知响应对象
     */
    @JsonProperty("mobile_charge_notify_response")
    private MobileChargeNotifyResponse mobileChargeNotifyResponse;

    
    public MobileChargeNotifyResponse getMobileChargeNotifyResponse() {
        return mobileChargeNotifyResponse;
    }

    
    public static class MobileChargeNotifyResponse {

        /**
         * 回调通知结果，true-成功，false-失败
         */
        @JsonProperty("success")
        private Boolean success;

        
        public Boolean getSuccess() {
            return success;
        }

        
    }
    
}