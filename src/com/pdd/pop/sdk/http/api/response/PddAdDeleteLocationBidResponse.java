package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdDeleteLocationBidResponse extends PopBaseHttpResponse{

    /**
     * 开平返回
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    
    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponse {

        /**
         * 执行标识， true 成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}