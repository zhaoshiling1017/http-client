package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddLogisticsOnlineSendResponse extends PopBaseHttpResponse{

    /**
     * 发货通知响应对象
     */
    @JsonProperty("logistics_online_send_response")
    private LogisticsOnlineSendResponse logisticsOnlineSendResponse;

    
    public LogisticsOnlineSendResponse getLogisticsOnlineSendResponse() {
        return logisticsOnlineSendResponse;
    }

    
    public static class LogisticsOnlineSendResponse {

        /**
         * 是否成功，false-失败，true-成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}