package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddStockWareDetailQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddStockWareDetailQueryRequest extends PopBaseHttpRequest<PddStockWareDetailQueryResponse>{

    /**
     * 货品id
     */
    @JsonProperty("ware_id")
    private Long wareId;

    
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
        return "pdd.stock.ware.detail.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareDetailQueryResponse> getResponseClass() {
        return PddStockWareDetailQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(wareId != null) {
            paramsMap.put("ware_id", wareId.toString());
            
        }
        
        return paramsMap;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    
    
}