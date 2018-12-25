package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkOauthResourceUrlGenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddDdkOauthResourceUrlGenRequest extends PopBaseHttpRequest<PddDdkOauthResourceUrlGenResponse>{

    /**
     * 推广位
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 频道来源：4-限时秒杀,39997-充值中心, 39998-转链type
     */
    @JsonProperty("resource_type")
    private Integer resourceType;

    /**
     * 原链接
     */
    @JsonProperty("url")
    private String url;

    
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
        return "pdd.ddk.oauth.resource.url.gen";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthResourceUrlGenResponse> getResponseClass() {
        return PddDdkOauthResourceUrlGenResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(pid != null) {
            paramsMap.put("pid", pid.toString());
            
        }
        if(resourceType != null) {
            paramsMap.put("resource_type", resourceType.toString());
            
        }
        if(url != null) {
            paramsMap.put("url", url.toString());
            
        }
        
        return paramsMap;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
}