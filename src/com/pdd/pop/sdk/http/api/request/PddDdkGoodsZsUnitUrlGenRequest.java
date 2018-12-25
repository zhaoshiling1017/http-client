package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkGoodsZsUnitUrlGenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddDdkGoodsZsUnitUrlGenRequest extends PopBaseHttpRequest<PddDdkGoodsZsUnitUrlGenResponse>{

    /**
     * 需转链的链接
     */
    @JsonProperty("source_url")
    private String sourceUrl;

    /**
     * 渠道id
     */
    @JsonProperty("pid")
    private String pid;

    
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
        return "pdd.ddk.goods.zs.unit.url.gen";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsZsUnitUrlGenResponse> getResponseClass() {
        return PddDdkGoodsZsUnitUrlGenResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(sourceUrl != null) {
            paramsMap.put("source_url", sourceUrl.toString());
            
        }
        if(pid != null) {
            paramsMap.put("pid", pid.toString());
            
        }
        
        return paramsMap;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    
    
}