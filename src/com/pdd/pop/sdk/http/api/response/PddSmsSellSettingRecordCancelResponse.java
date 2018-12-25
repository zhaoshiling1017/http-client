package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsSellSettingRecordCancelResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_sell_setting_record_cancel_response")
    private SmsSellSettingRecordCancelResponse smsSellSettingRecordCancelResponse;

    
    public SmsSellSettingRecordCancelResponse getSmsSellSettingRecordCancelResponse() {
        return smsSellSettingRecordCancelResponse;
    }

    
    public static class SmsSellSettingRecordCancelResponse {

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