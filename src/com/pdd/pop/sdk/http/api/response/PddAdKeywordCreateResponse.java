package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdKeywordCreateResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_keyword_create_response")
    private AdKeywordCreateResponse adKeywordCreateResponse;

    
    public AdKeywordCreateResponse getAdKeywordCreateResponse() {
        return adKeywordCreateResponse;
    }

    
    public static class AdKeywordCreateResponse {

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