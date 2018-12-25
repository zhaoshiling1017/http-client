package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdPlanCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddAdPlanCreateRequest extends PopBaseHttpRequest<PddAdPlanCreateResponse>{

    /**
     * 0--搜索广告,1--明星店铺,2--定向广告,3--首页Banner广告（目前只支持0，暂不支持1、2、3）
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * 计划名
     */
    @JsonProperty("plan_name")
    private String planName;

    /**
     * 单日消耗，单位厘;上限不能超过1000000元，单日消耗上限不能低于100元 , 默认不限额，即1000000 元
     */
    @JsonProperty("max_cost")
    private Long maxCost;

    /**
     * List<JsonObject> 的json string. 示例：[{"rate":1000,"index":12},{"rate":1000,"index":13}]
     */
    @JsonProperty("discounts")
    private List<DiscountsItem> discounts;

    
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
        return "pdd.ad.plan.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdPlanCreateResponse> getResponseClass() {
        return PddAdPlanCreateResponse.class;
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
        if(planName != null) {
            paramsMap.put("plan_name", planName.toString());
            
        }
        if(maxCost != null) {
            paramsMap.put("max_cost", maxCost.toString());
            
        }
        if(discounts != null) {
            paramsMap.put("discounts", discounts.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setMaxCost(Long maxCost) {
        this.maxCost = maxCost;
    }

    public void setDiscounts(List<DiscountsItem> discounts) {
        this.discounts = discounts;
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