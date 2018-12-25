package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsSellDeletingResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_sell_deleting_response")
    private SmsSellDeletingResponse smsSellDeletingResponse;

    
    public SmsSellDeletingResponse getSmsSellDeletingResponse() {
        return smsSellDeletingResponse;
    }

    
    public static class SmsSellDeletingResponse {

        /**
         * 是否成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}