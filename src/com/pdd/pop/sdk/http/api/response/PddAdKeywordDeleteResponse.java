package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdKeywordDeleteResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_keyword_delete_response")
    private AdKeywordDeleteResponse adKeywordDeleteResponse;

    
    public AdKeywordDeleteResponse getAdKeywordDeleteResponse() {
        return adKeywordDeleteResponse;
    }

    
    public static class AdKeywordDeleteResponse {

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