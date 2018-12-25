package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddMallInfoVerifyApplicationAddResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("mall_info_verify_application_add_response")
    private MallInfoVerifyApplicationAddResponse mallInfoVerifyApplicationAddResponse;

    
    public MallInfoVerifyApplicationAddResponse getMallInfoVerifyApplicationAddResponse() {
        return mallInfoVerifyApplicationAddResponse;
    }

    
    public static class MallInfoVerifyApplicationAddResponse {

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