package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddStockDepotPriorityUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddStockDepotPriorityUpdateRequest extends PopBaseHttpRequest<PddStockDepotPriorityUpdateResponse>{

    /**
     * 示例：[{"depot_id":1,"province_id":12,"city_id":34,"district_id":56,"priority":5}]
     */
    @JsonProperty("priority_list")
    private List<PriorityListItem> priorityList;

    
    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public String getType() {
        return "pdd.stock.depot.priority.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockDepotPriorityUpdateResponse> getResponseClass() {
        return PddStockDepotPriorityUpdateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(priorityList != null) {
            paramsMap.put("priority_list", priorityList.toString());
            
        }
        
        return paramsMap;
    }

    public void setPriorityList(List<PriorityListItem> priorityList) {
        this.priorityList = priorityList;
    }

    
    public static class PriorityListItem {

        /**
         * 优先级 范围是1 - 999
         */
        @JsonProperty("priority")
        private Integer priority;

        /**
         * 区id
         */
        @JsonProperty("district_id")
        private Integer districtId;

        /**
         * 市id
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 省id
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 仓库id
         */
        @JsonProperty("depot_id")
        private Long depotId;

        
        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public void setDistrictId(Integer districtId) {
            this.districtId = districtId;
        }

        public void setCityId(Integer cityId) {
            this.cityId = cityId;
        }

        public void setProvinceId(Integer provinceId) {
            this.provinceId = provinceId;
        }

        public void setDepotId(Long depotId) {
            this.depotId = depotId;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}