package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdCanCreatePlanResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("ad_plan_create_response")
    private AdPlanCreateResponse adPlanCreateResponse;

    
    public AdPlanCreateResponse getAdPlanCreateResponse() {
        return adPlanCreateResponse;
    }

    
    public static class AdPlanCreateResponse {

        /**
         * 是否可以创建
         */
        @JsonProperty("creatable")
        private Boolean creatable;

        
        public Boolean getCreatable() {
            return creatable;
        }

        
    }
    
}