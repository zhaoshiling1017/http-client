package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddExpressSearchDepotResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddExpressSearchDepotRequest extends PopBaseHttpRequest<PddExpressSearchDepotResponse>{

    /**
     * 仓库名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 仓库编码
     */
    @JsonProperty("code")
    private String code;

    /**
     * 0 分页数据起始位置
     */
    @JsonProperty("start")
    private Integer start;

    /**
     * 10 分页数据size
     */
    @JsonProperty("length")
    private Integer length;

    
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
        return "pdd.express.search.depot";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressSearchDepotResponse> getResponseClass() {
        return PddExpressSearchDepotResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(name != null) {
            paramsMap.put("name", name.toString());
            
        }
        if(code != null) {
            paramsMap.put("code", code.toString());
            
        }
        if(start != null) {
            paramsMap.put("start", start.toString());
            
        }
        if(length != null) {
            paramsMap.put("length", length.toString());
            
        }
        
        return paramsMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    
    
}