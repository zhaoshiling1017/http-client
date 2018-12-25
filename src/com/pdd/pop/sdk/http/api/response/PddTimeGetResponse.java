package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddTimeGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("time_get_response")
    private TimeGetResponse timeGetResponse;

    
    public TimeGetResponse getTimeGetResponse() {
        return timeGetResponse;
    }

    
    public static class TimeGetResponse {

        /**
         * 拼多多系统时间
         */
        @JsonProperty("time")
        private String time;

        
        public String getTime() {
            return time;
        }

        
    }
    
}