package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdUnitOptStatusUpdateResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_unit_opt_status_update_response")
    private AdUnitOptStatusUpdateResponse adUnitOptStatusUpdateResponse;

    
    public AdUnitOptStatusUpdateResponse getAdUnitOptStatusUpdateResponse() {
        return adUnitOptStatusUpdateResponse;
    }

    
    public static class AdUnitOptStatusUpdateResponse {

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