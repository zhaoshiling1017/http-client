package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddLogisticsCsSessionCloseResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("logistics_cs_session_close_response")
    private LogisticsCsSessionCloseResponse logisticsCsSessionCloseResponse;

    
    public LogisticsCsSessionCloseResponse getLogisticsCsSessionCloseResponse() {
        return logisticsCsSessionCloseResponse;
    }

    
    public static class LogisticsCsSessionCloseResponse {

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