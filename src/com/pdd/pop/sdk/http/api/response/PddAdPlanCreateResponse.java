package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdPlanCreateResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_plan_create_response")
    private AdPlanCreateResponse adPlanCreateResponse;

    
    public AdPlanCreateResponse getAdPlanCreateResponse() {
        return adPlanCreateResponse;
    }

    
    public static class AdPlanCreateResponse {

        /**
         * 广告计划id
         */
        @JsonProperty("ad_plan_id")
        private Long adPlanId;

        
        public Long getAdPlanId() {
            return adPlanId;
        }

        
    }
    
}