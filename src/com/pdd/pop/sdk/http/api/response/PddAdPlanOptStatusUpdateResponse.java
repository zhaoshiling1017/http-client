package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdPlanOptStatusUpdateResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_plan_opt_status_update_response")
    private AdPlanOptStatusUpdateResponse adPlanOptStatusUpdateResponse;

    
    public AdPlanOptStatusUpdateResponse getAdPlanOptStatusUpdateResponse() {
        return adPlanOptStatusUpdateResponse;
    }

    
    public static class AdPlanOptStatusUpdateResponse {

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