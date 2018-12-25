package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsCatTemplateGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsCatTemplateGetRequest extends PopBaseHttpRequest<PddGoodsCatTemplateGetResponse>{

    /**
     * 类目id
     */
    @JsonProperty("cat_id")
    private Long catId;

    
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
        return "pdd.goods.cat.template.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCatTemplateGetResponse> getResponseClass() {
        return PddGoodsCatTemplateGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(catId != null) {
            paramsMap.put("cat_id", catId.toString());
            
        }
        
        return paramsMap;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    
    
}