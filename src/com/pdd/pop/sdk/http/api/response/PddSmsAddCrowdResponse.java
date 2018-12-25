package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsAddCrowdResponse extends PopBaseHttpResponse{

    /**
     * 创建结果，为空成功
     */
    @JsonProperty("sms_add_crowd_response")
    private SmsAddCrowdResponse smsAddCrowdResponse;

    
    public SmsAddCrowdResponse getSmsAddCrowdResponse() {
        return smsAddCrowdResponse;
    }

    
    public static class SmsAddCrowdResponse {

        /**
         * 请求结果
         */
        @JsonProperty("result")
        private String result;

        
        public String getResult() {
            return result;
        }

        
    }
    
}