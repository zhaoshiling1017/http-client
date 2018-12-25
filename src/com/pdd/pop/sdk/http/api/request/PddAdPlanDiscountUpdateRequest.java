package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdPlanDiscountUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddAdPlanDiscountUpdateRequest extends PopBaseHttpRequest<PddAdPlanDiscountUpdateResponse>{

    /**
     * 推广计划id
     */
    @JsonProperty("plan_id")
    private Long planId;

    /**
     * List<JsonObject> 的json string. 示例：[{"rate":1000,"index":12},{"rate":1000,"index":13}]
     */
    @JsonProperty("discounts")
    private List<DiscountsItem> discounts;

    /**
     * 0 :搜索广告
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    
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
        return "pdd.ad.plan.discount.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdPlanDiscountUpdateResponse> getResponseClass() {
        return PddAdPlanDiscountUpdateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(planId != null) {
            paramsMap.put("plan_id", planId.toString());
            
        }
        if(discounts != null) {
            paramsMap.put("discounts", discounts.toString());
            
        }
        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        
        return paramsMap;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public void setDiscounts(List<DiscountsItem> discounts) {
        this.discounts = discounts;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    
    public static class DiscountsItem {

        /**
         * 折扣率，1000 表示 100.0%，0 表示不投放，自定义范围 500 ~ 3000（10的倍数）
         */
        @JsonProperty("rate")
        private Integer rate;

        /**
         * 时间段索引，0 ~ 23
         */
        @JsonProperty("index")
        private Integer index;

        
        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}