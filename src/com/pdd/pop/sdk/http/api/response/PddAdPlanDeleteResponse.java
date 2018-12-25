package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdPlanDeleteResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_plan_delete_response")
    private AdPlanDeleteResponse adPlanDeleteResponse;

    
    public AdPlanDeleteResponse getAdPlanDeleteResponse() {
        return adPlanDeleteResponse;
    }

    
    public static class AdPlanDeleteResponse {

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