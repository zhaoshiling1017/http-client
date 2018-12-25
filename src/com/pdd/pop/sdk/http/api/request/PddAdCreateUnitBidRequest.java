package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdCreateUnitBidResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddAdCreateUnitBidRequest extends PopBaseHttpRequest<PddAdCreateUnitBidResponse>{

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
     * 定向人群列表
     */
    @JsonProperty("bids")
    private List<BidsItem> bids;

    
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
        return "pdd.ad.create.unit.bid";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdCreateUnitBidResponse> getResponseClass() {
        return PddAdCreateUnitBidResponse.class;
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
        if(bids != null) {
            paramsMap.put("bids", bids.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setBids(List<BidsItem> bids) {
        this.bids = bids;
    }

    
    public static class BidsItem {

        /**
         * 非通投时填	
溢价比例，存储的是整数，比如2013，实际表示的是溢价20.13%

溢价比例最低值为10%，最高为300%
         */
        @JsonProperty("bid_premium_rate")
        private Integer bidPremiumRate;

        /**
         * 通投时填 , 溢价绝对值，单位厘
         */
        @JsonProperty("bid")
        private Long bid;

        /**
         * 兴趣点ID，targetType不为6/7时，传 0
         */
        @JsonProperty("sub_level_target_id")
        private Long subLevelTargetId;

        /**
         * 1：通投（必有）
2：访客重定向
3：相似商品定向
4：叶子类目定向
5：相似店铺定向
6：近期对我的商品相关属性感兴趣的用户
7：人群包定向
         */
        @JsonProperty("target_type")
        private Integer targetType;

        
        public void setBidPremiumRate(Integer bidPremiumRate) {
            this.bidPremiumRate = bidPremiumRate;
        }

        public void setBid(Long bid) {
            this.bid = bid;
        }

        public void setSubLevelTargetId(Long subLevelTargetId) {
            this.subLevelTargetId = subLevelTargetId;
        }

        public void setTargetType(Integer targetType) {
            this.targetType = targetType;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}