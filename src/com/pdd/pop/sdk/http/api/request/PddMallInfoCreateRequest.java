package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddMallInfoCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddMallInfoCreateRequest extends PopBaseHttpRequest<PddMallInfoCreateResponse>{

    /**
     * 第三方软件账号id
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * 店主名称
     */
    @JsonProperty("ww_name")
    private String wwName;

    
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
        return "pdd.mall.info.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallInfoCreateResponse> getResponseClass() {
        return PddMallInfoCreateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(userId != null) {
            paramsMap.put("user_id", userId.toString());
            
        }
        if(wwName != null) {
            paramsMap.put("ww_name", wwName.toString());
            
        }
        
        return paramsMap;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setWwName(String wwName) {
        this.wwName = wwName;
    }

    
    
}