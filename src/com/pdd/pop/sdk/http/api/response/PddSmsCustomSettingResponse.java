package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsCustomSettingResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_custom_setting_response")
    private SmsCustomSettingResponse smsCustomSettingResponse;

    
    public SmsCustomSettingResponse getSmsCustomSettingResponse() {
        return smsCustomSettingResponse;
    }

    
    public static class SmsCustomSettingResponse {

        /**
         * 结果
         */
        @JsonProperty("result")
        private Long result;

        
        public Long getResult() {
            return result;
        }

        
    }
    
}