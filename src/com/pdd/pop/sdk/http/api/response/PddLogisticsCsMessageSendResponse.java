package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddLogisticsCsMessageSendResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("logistics_cs_message_send_response")
    private LogisticsCsMessageSendResponse logisticsCsMessageSendResponse;

    
    public LogisticsCsMessageSendResponse getLogisticsCsMessageSendResponse() {
        return logisticsCsMessageSendResponse;
    }

    
    public static class LogisticsCsMessageSendResponse {

        /**
         * 是否成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}