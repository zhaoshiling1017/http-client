package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddLogisticsCsSessionStartResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("logistics_cs_session_start_response")
    private LogisticsCsSessionStartResponse logisticsCsSessionStartResponse;

    
    public LogisticsCsSessionStartResponse getLogisticsCsSessionStartResponse() {
        return logisticsCsSessionStartResponse;
    }

    
    public static class LogisticsCsSessionStartResponse {

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