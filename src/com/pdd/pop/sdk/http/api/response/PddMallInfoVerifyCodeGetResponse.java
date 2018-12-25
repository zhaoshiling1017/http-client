package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddMallInfoVerifyCodeGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("mall_info_verify_code_get_response")
    private MallInfoVerifyCodeGetResponse mallInfoVerifyCodeGetResponse;

    
    public MallInfoVerifyCodeGetResponse getMallInfoVerifyCodeGetResponse() {
        return mallInfoVerifyCodeGetResponse;
    }

    
    public static class MallInfoVerifyCodeGetResponse {

        /**
         * 核实验证码
         */
        @JsonProperty("verify_code")
        private String verifyCode;

        
        public String getVerifyCode() {
            return verifyCode;
        }

        
    }
    
}