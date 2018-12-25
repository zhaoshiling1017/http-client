package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddStockDepotPriorityListResponse extends PopBaseHttpResponse{

    /**
     * 响应内容
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    
    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponse {

        /**
         * 总数
         */
        @JsonProperty("count")
        private Integer count;

        /**
         * 仓库列表
         */
        @JsonProperty("depot_list")
        private List<DepotListItem> depotList;

        
        public Integer getCount() {
            return count;
        }

        public List<DepotListItem> getDepotList() {
            return depotList;
        }

        
    }
    public static class DepotListItem {

        /**
         * 仓库id
         */
        @JsonProperty("depot_id")
        private String depotId;

        /**
         * 仓库地址（省编号）
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 仓库地址（市编号）
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 仓库地址（区编号）
         */
        @JsonProperty("district_id")
        private Integer districtId;

        /**
         * 仓库编码
         */
        @JsonProperty("depot_code")
        private String depotCode;

        /**
         * 仓库名称
         */
        @JsonProperty("depot_name")
        private String depotName;

        /**
         * 优先级
         */
        @JsonProperty("priority")
        private Integer priority;

        
        public String getDepotId() {
            return depotId;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public Integer getCityId() {
            return cityId;
        }

        public Integer getDistrictId() {
            return districtId;
        }

        public String getDepotCode() {
            return depotCode;
        }

        public String getDepotName() {
            return depotName;
        }

        public Integer getPriority() {
            return priority;
        }

        
    }
    
}