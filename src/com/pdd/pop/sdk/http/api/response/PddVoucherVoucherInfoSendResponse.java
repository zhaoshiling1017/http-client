package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddVoucherVoucherInfoSendResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("voucher_voucher_info_send_response")
    private VoucherVoucherInfoSendResponse voucherVoucherInfoSendResponse;

    
    public VoucherVoucherInfoSendResponse getVoucherVoucherInfoSendResponse() {
        return voucherVoucherInfoSendResponse;
    }

    
    public static class VoucherVoucherInfoSendResponse {

        /**
         * 是否请求成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}