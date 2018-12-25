package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdUnitCreateResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_unit_create_response")
    private AdUnitCreateResponse adUnitCreateResponse;

    
    public AdUnitCreateResponse getAdUnitCreateResponse() {
        return adUnitCreateResponse;
    }

    
    public static class AdUnitCreateResponse {

        /**
         * 单元id
         */
        @JsonProperty("unit_id")
        private Long unitId;

        /**
         * 是否成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Long getUnitId() {
            return unitId;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}