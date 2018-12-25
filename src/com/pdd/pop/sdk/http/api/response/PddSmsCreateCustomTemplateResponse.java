package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsCreateCustomTemplateResponse extends PopBaseHttpResponse{

    /**
     * 创建结果
     */
    @JsonProperty("sms_create_custom_template_response")
    private SmsCreateCustomTemplateResponse smsCreateCustomTemplateResponse;

    
    public SmsCreateCustomTemplateResponse getSmsCreateCustomTemplateResponse() {
        return smsCreateCustomTemplateResponse;
    }

    
    public static class SmsCreateCustomTemplateResponse {

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