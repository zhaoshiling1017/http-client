package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddVoucherPhysicalGoodsSendResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("voucher_physical_voucher_send_response")
    private VoucherPhysicalVoucherSendResponse voucherPhysicalVoucherSendResponse;

    
    public VoucherPhysicalVoucherSendResponse getVoucherPhysicalVoucherSendResponse() {
        return voucherPhysicalVoucherSendResponse;
    }

    
    public static class VoucherPhysicalVoucherSendResponse {

        /**
         * 请求成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}