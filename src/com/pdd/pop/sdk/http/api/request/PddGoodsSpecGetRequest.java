package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsSpecGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsSpecGetRequest extends PopBaseHttpRequest<PddGoodsSpecGetResponse>{

    /**
     * 叶子类目ID，必须入参level=3时的cat_id,否则无法返回正确的参数
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
        return "pdd.goods.spec.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSpecGetResponse> getResponseClass() {
        return PddGoodsSpecGetResponse.class;
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