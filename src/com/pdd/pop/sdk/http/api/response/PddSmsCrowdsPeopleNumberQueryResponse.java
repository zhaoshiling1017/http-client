package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsCrowdsPeopleNumberQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_crows_people_number_query_response")
    private SmsCrowsPeopleNumberQueryResponse smsCrowsPeopleNumberQueryResponse;

    
    public SmsCrowsPeopleNumberQueryResponse getSmsCrowsPeopleNumberQueryResponse() {
        return smsCrowsPeopleNumberQueryResponse;
    }

    
    public static class SmsCrowsPeopleNumberQueryResponse {

        /**
         * 筛选人数
         */
        @JsonProperty("object_num")
        private Long objectNum;

        /**
         * 短信余量
         */
        @JsonProperty("remain")
        private Long remain;

        
        public Long getObjectNum() {
            return objectNum;
        }

        public Long getRemain() {
            return remain;
        }

        
    }
    
}