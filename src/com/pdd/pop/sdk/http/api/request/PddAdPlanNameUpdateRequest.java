package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdPlanNameUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdPlanNameUpdateRequest extends PopBaseHttpRequest<PddAdPlanNameUpdateResponse>{

    /**
     * 0--搜索广告,1--明星店铺,2--定向广告,3--首页Banner广告（目前只支持0，暂不支持1、2、3）
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * 计划id
     */
    @JsonProperty("plan_id")
    private Long planId;

    /**
     * 计划名
     */
    @JsonProperty("plan_name")
    private String planName;

    
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
        return "pdd.ad.plan.name.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdPlanNameUpdateResponse> getResponseClass() {
        return PddAdPlanNameUpdateResponse.class;
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
        if(planId != null) {
            paramsMap.put("plan_id", planId.toString());
            
        }
        if(planName != null) {
            paramsMap.put("plan_name", planName.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    
    
}