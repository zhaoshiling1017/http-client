package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsAuthorizationCatsResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsAuthorizationCatsRequest extends PopBaseHttpRequest<PddGoodsAuthorizationCatsResponse>{

    /**
     * 默认值=0，值=0时为顶点cat_id,通过树顶级节点获取一级类目
     */
    @JsonProperty("parent_cat_id")
    private Long parentCatId;

    
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
        return "pdd.goods.authorization.cats";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsAuthorizationCatsResponse> getResponseClass() {
        return PddGoodsAuthorizationCatsResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(parentCatId != null) {
            paramsMap.put("parent_cat_id", parentCatId.toString());
            
        }
        
        return paramsMap;
    }

    public void setParentCatId(Long parentCatId) {
        this.parentCatId = parentCatId;
    }

    
    
}