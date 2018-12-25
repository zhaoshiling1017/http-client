package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddVoucherVoucherComplainResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("voucher_voucher_complain_response")
    private VoucherVoucherComplainResponse voucherVoucherComplainResponse;

    
    public VoucherVoucherComplainResponse getVoucherVoucherComplainResponse() {
        return voucherVoucherComplainResponse;
    }

    
    public static class VoucherVoucherComplainResponse {

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