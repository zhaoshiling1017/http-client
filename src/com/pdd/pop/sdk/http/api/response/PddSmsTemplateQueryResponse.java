package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddSmsTemplateQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_template_query_response")
    private SmsTemplateQueryResponse smsTemplateQueryResponse;

    
    public SmsTemplateQueryResponse getSmsTemplateQueryResponse() {
        return smsTemplateQueryResponse;
    }

    
    public static class ResultItem {

        /**
         * 编号
         */
        @JsonProperty("code")
        private Long code;

        /**
         * 描述
         */
        @JsonProperty("desc")
        private String desc;

        
        public Long getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

        
    }
    public static class SmsTemplateQueryResponse {

        /**
         * 列表
         */
        @JsonProperty("result")
        private List<ResultItem> result;

        
        public List<ResultItem> getResult() {
            return result;
        }

        
    }
    
}