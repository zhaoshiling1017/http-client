package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdCreateLocationBidResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddAdCreateLocationBidRequest extends PopBaseHttpRequest<PddAdCreateLocationBidResponse>{

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
    @JsonProperty("location_bids")
    private List<LocationBidsItem> locationBids;

    
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
        return "pdd.ad.create.location.bid";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdCreateLocationBidResponse> getResponseClass() {
        return PddAdCreateLocationBidResponse.class;
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
        if(locationBids != null) {
            paramsMap.put("location_bids", locationBids.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setLocationBids(List<LocationBidsItem> locationBids) {
        this.locationBids = locationBids;
    }

    
    public static class LocationBidsItem {

        /**
         * 溢价比例，存储的是整数，100 表示 1%，支持设置 1%-300%
         */
        @JsonProperty("bid_premium_rate")
        private Integer bidPremiumRate;

        /**
         * 资源位类型（1：类目商品页，2：商品详情页，3：营销活动页）
         */
        @JsonProperty("location_type")
        private Integer locationType;

        
        public void setBidPremiumRate(Integer bidPremiumRate) {
            this.bidPremiumRate = bidPremiumRate;
        }

        public void setLocationType(Integer locationType) {
            this.locationType = locationType;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}