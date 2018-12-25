package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsSellSettingResponse extends PopBaseHttpResponse{

    /**
     * 返回结果
     */
    @JsonProperty("sms_sell_setting_response")
    private SmsSellSettingResponse smsSellSettingResponse;

    
    public SmsSellSettingResponse getSmsSellSettingResponse() {
        return smsSellSettingResponse;
    }

    
    public static class SmsSellSettingResponse {

        /**
         * 请求结果
         */
        @JsonProperty("result")
        private Long result;

        
        public Long getResult() {
            return result;
        }

        
    }
    
}