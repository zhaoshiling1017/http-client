package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsRemainDetailQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_remain_detail_query_response")
    private SmsRemainDetailQueryResponse smsRemainDetailQueryResponse;

    
    public SmsRemainDetailQueryResponse getSmsRemainDetailQueryResponse() {
        return smsRemainDetailQueryResponse;
    }

    
    public static class SmsRemainDetailQueryResponse {

        /**
         * 剩余金额
         */
        @JsonProperty("remain_money")
        private Long remainMoney;

        /**
         * 剩余数量
         */
        @JsonProperty("remain_number")
        private Long remainNumber;

        
        public Long getRemainMoney() {
            return remainMoney;
        }

        public Long getRemainNumber() {
            return remainNumber;
        }

        
    }
    
}