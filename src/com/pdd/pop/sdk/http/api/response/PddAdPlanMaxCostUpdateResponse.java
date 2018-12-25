package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdPlanMaxCostUpdateResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_plan_max_cost_update_response")
    private AdPlanMaxCostUpdateResponse adPlanMaxCostUpdateResponse;

    
    public AdPlanMaxCostUpdateResponse getAdPlanMaxCostUpdateResponse() {
        return adPlanMaxCostUpdateResponse;
    }

    
    public static class AdPlanMaxCostUpdateResponse {

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