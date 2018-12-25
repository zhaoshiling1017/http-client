package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddExpressDepotInfoGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddExpressDepotInfoGetRequest extends PopBaseHttpRequest<PddExpressDepotInfoGetResponse>{

    /**
     * 仓库id
     */
    @JsonProperty("depot_id")
    private Long depotId;

    
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
        return "pdd.express.depot.info.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressDepotInfoGetResponse> getResponseClass() {
        return PddExpressDepotInfoGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(depotId != null) {
            paramsMap.put("depot_id", depotId.toString());
            
        }
        
        return paramsMap;
    }

    public void setDepotId(Long depotId) {
        this.depotId = depotId;
    }

    
    
}