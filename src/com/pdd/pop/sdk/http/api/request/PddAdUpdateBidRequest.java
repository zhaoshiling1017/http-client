package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdUpdateBidResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdUpdateBidRequest extends PopBaseHttpRequest<PddAdUpdateBidResponse>{

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
     * 定向列表
     */
    @JsonProperty("bid_list")
    private BidList bidList;

    
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
        return "pdd.ad.update.bid";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdUpdateBidResponse> getResponseClass() {
        return PddAdUpdateBidResponse.class;
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
        if(bidList != null) {
            paramsMap.put("bid_list", bidList.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setBidList(BidList bidList) {
        this.bidList = bidList;
    }

    
    public static class BidList {

        /**
         * 非通投必填	
溢价比例，存储的是整数，比如2013，实际表示的是溢价20.13%

溢价比例最低值为10%，最高为300%
         */
        @JsonProperty("bid_premium_rate")
        private Integer bidPremiumRate;

        /**
         * 通投必填	溢价绝对值，单位厘，通投时，使用这个值，其他情况使用bid_premium_rate
         */
        @JsonProperty("bid")
        private Long bid;

        /**
         * 定向ID
         */
        @JsonProperty("bid_id")
        private Long bidId;

        
        public void setBidPremiumRate(Integer bidPremiumRate) {
            this.bidPremiumRate = bidPremiumRate;
        }

        public void setBid(Long bid) {
            this.bid = bid;
        }

        public void setBidId(Long bidId) {
            this.bidId = bidId;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}