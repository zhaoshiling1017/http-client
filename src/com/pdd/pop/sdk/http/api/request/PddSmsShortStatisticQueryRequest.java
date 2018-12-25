package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsShortStatisticQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddSmsShortStatisticQueryRequest extends PopBaseHttpRequest<PddSmsShortStatisticQueryResponse>{

    /**
     * 任务id
     */
    @JsonProperty("setting_id")
    private Long settingId;

    
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
        return "pdd.sms.short.statistic.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsShortStatisticQueryResponse> getResponseClass() {
        return PddSmsShortStatisticQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(settingId != null) {
            paramsMap.put("setting_id", settingId.toString());
            
        }
        
        return paramsMap;
    }

    public void setSettingId(Long settingId) {
        this.settingId = settingId;
    }

    
    
}