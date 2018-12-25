package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdCreativeDeleteResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdCreativeDeleteRequest extends PopBaseHttpRequest<PddAdCreativeDeleteResponse>{

    /**
     * 
     */
    @JsonProperty("creative_id")
    private Long creativeId;

    /**
     * 0:搜索广告
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
        return "pdd.ad.creative.delete";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdCreativeDeleteResponse> getResponseClass() {
        return PddAdCreativeDeleteResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(creativeId != null) {
            paramsMap.put("creative_id", creativeId.toString());
            
        }
        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        
        return paramsMap;
    }

    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    
    
}