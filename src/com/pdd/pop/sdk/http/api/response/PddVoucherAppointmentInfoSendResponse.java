package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddVoucherAppointmentInfoSendResponse extends PopBaseHttpResponse{

    /**
     * voucher_appointment_info_send_response
     */
    @JsonProperty("voucher_appointment_info_send_response")
    private VoucherAppointmentInfoSendResponse voucherAppointmentInfoSendResponse;

    
    public VoucherAppointmentInfoSendResponse getVoucherAppointmentInfoSendResponse() {
        return voucherAppointmentInfoSendResponse;
    }

    
    public static class VoucherAppointmentInfoSendResponse {

        /**
         * is_success
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}