package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdUpdateBidResponse extends PopBaseHttpResponse{

    /**
     * 返回结果
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    
    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponse {

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