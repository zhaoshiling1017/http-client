package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdUpdateLocationBidResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddAdUpdateLocationBidRequest extends PopBaseHttpRequest<PddAdUpdateLocationBidResponse>{

    /**
     * 推广类型  2-展示推广
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * 单元ID
     */
    @JsonProperty("unit_id")
    private Long unitId;

    /**
     * 
     */
    @JsonProperty("location_bid_list")
    private List<LocationBidListItem> locationBidList;

    
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
        return "pdd.ad.update.location.bid";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdUpdateLocationBidResponse> getResponseClass() {
        return PddAdUpdateLocationBidResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        if(unitId != null) {
            paramsMap.put("unit_id", unitId.toString());
            
        }
        if(locationBidList != null) {
            paramsMap.put("location_bid_list", locationBidList.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setLocationBidList(List<LocationBidListItem> locationBidList) {
        this.locationBidList = locationBidList;
    }

    
    public static class LocationBidListItem {

        /**
         * 溢价比例，例如2013，实际表示的是溢价20.13%，支持设置 1%-300%
         */
        @JsonProperty("bid_premium_rate")
        private Integer bidPremiumRate;

        /**
         * 资源位id
         */
        @JsonProperty("location_bid_id")
        private Long locationBidId;

        
        public void setBidPremiumRate(Integer bidPremiumRate) {
            this.bidPremiumRate = bidPremiumRate;
        }

        public void setLocationBidId(Long locationBidId) {
            this.locationBidId = locationBidId;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}