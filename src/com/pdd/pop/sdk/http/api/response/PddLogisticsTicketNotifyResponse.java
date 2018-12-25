package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddLogisticsTicketNotifyResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("logistics_ticket_notify_response")
    private LogisticsTicketNotifyResponse logisticsTicketNotifyResponse;

    
    public LogisticsTicketNotifyResponse getLogisticsTicketNotifyResponse() {
        return logisticsTicketNotifyResponse;
    }

    
    public static class LogisticsTicketNotifyResponse {

        /**
         * 是否修改成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}