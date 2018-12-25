package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsRemainSettingResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_remain_setting_response")
    private SmsRemainSettingResponse smsRemainSettingResponse;

    
    public SmsRemainSettingResponse getSmsRemainSettingResponse() {
        return smsRemainSettingResponse;
    }

    
    public static class SmsRemainSettingResponse {

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