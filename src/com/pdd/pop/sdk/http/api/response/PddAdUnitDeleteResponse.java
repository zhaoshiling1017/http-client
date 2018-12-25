package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdUnitDeleteResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_unit_delete_response")
    private AdUnitDeleteResponse adUnitDeleteResponse;

    
    public AdUnitDeleteResponse getAdUnitDeleteResponse() {
        return adUnitDeleteResponse;
    }

    
    public static class AdUnitDeleteResponse {

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