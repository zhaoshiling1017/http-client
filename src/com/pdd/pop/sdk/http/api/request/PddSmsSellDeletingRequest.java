package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsSellDeletingResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddSmsSellDeletingRequest extends PopBaseHttpRequest<PddSmsSellDeletingResponse>{

    /**
     * 任务id
     */
    @JsonProperty("id")
    private Long id;

    
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
        return "pdd.sms.sell.deleting";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsSellDeletingResponse> getResponseClass() {
        return PddSmsSellDeletingResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(id != null) {
            paramsMap.put("id", id.toString());
            
        }
        
        return paramsMap;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}