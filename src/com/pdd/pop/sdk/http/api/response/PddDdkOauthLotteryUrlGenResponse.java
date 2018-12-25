package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddDdkOauthLotteryUrlGenResponse extends PopBaseHttpResponse{

    /**
     * lottery_url_response
     */
    @JsonProperty("lottery_url_response")
    private LotteryUrlResponse lotteryUrlResponse;

    
    public LotteryUrlResponse getLotteryUrlResponse() {
        return lotteryUrlResponse;
    }

    
    public static class LotteryUrlResponse {

        /**
         * 返回总数
         */
        @JsonProperty("total")
        private Integer total;

        
        public Integer getTotal() {
            return total;
        }

        
    }
    
}