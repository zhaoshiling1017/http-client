package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdCreativeQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdCreativeQueryRequest extends PopBaseHttpRequest<PddAdCreativeQueryResponse>{

    /**
     * 单元id
     */
    @JsonProperty("unit_id")
    private Long unitId;

    /**
     * 格式："yyyy-MM-dd" 时区："GMT+8"
     */
    @JsonProperty("begin_date")
    private String beginDate;

    /**
     * 格式："yyyy-MM-dd" 时区："GMT+8"
     */
    @JsonProperty("end_date")
    private String endDate;

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
        return "pdd.ad.creative.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdCreativeQueryResponse> getResponseClass() {
        return PddAdCreativeQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(unitId != null) {
            paramsMap.put("unit_id", unitId.toString());
            
        }
        if(beginDate != null) {
            paramsMap.put("begin_date", beginDate.toString());
            
        }
        if(endDate != null) {
            paramsMap.put("end_date", endDate.toString());
            
        }
        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        
        return paramsMap;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    
    
}