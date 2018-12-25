package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdKeywordUpdateResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_keyword_update_response")
    private AdKeywordUpdateResponse adKeywordUpdateResponse;

    
    public AdKeywordUpdateResponse getAdKeywordUpdateResponse() {
        return adKeywordUpdateResponse;
    }

    
    public static class AdKeywordUpdateResponse {

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