package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdQueryLocationBidPvListResponse extends PopBaseHttpResponse{

    /**
     * 开平出参
     */
    @JsonProperty("open_api_response")
    private List<OpenApiResponseItem> openApiResponse;

    
    public List<OpenApiResponseItem> getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponseItem {

        /**
         * 日均可竞流量
         */
        @JsonProperty("location_pv")
        private Long locationPv;

        /**
         * 资源位类型
         */
        @JsonProperty("location_type_desc")
        private String locationTypeDesc;

        /**
         * 资源位类型（1：类目商品页，2：商品详情页，3：营销活动页）
         */
        @JsonProperty("location_type")
        private Integer locationType;

        
        public Long getLocationPv() {
            return locationPv;
        }

        public String getLocationTypeDesc() {
            return locationTypeDesc;
        }

        public Integer getLocationType() {
            return locationType;
        }

        
    }
    
}