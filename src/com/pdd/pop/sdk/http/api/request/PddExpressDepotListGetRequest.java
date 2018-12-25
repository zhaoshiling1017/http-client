package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddExpressDepotListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddExpressDepotListGetRequest extends PopBaseHttpRequest<PddExpressDepotListGetResponse>{

    /**
     * 分页数据起始位置
     */
    @JsonProperty("start")
    private Long start;

    /**
     * 分页数据size
     */
    @JsonProperty("length")
    private Long length;

    
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
        return "pdd.express.depot.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressDepotListGetResponse> getResponseClass() {
        return PddExpressDepotListGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(start != null) {
            paramsMap.put("start", start.toString());
            
        }
        if(length != null) {
            paramsMap.put("length", length.toString());
            
        }
        
        return paramsMap;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    
    
}