package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddLogisticsCsHistoryMessageGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddLogisticsCsHistoryMessageGetRequest extends PopBaseHttpRequest<PddLogisticsCsHistoryMessageGetResponse>{

    /**
     * pdd会话id
     */
    @JsonProperty("session_id")
    private String sessionId;

    
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
        return "pdd.logistics.cs.history.message.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsCsHistoryMessageGetResponse> getResponseClass() {
        return PddLogisticsCsHistoryMessageGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(sessionId != null) {
            paramsMap.put("session_id", sessionId.toString());
            
        }
        
        return paramsMap;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    
    
}