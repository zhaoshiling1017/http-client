package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdPlanNameUpdateResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_plan_name_update_response")
    private AdPlanNameUpdateResponse adPlanNameUpdateResponse;

    
    public AdPlanNameUpdateResponse getAdPlanNameUpdateResponse() {
        return adPlanNameUpdateResponse;
    }

    
    public static class AdPlanNameUpdateResponse {

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