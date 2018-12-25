package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsOptGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsOptGetRequest extends PopBaseHttpRequest<PddGoodsOptGetResponse>{

    /**
     * 值=0时为顶点opt_id,通过树顶级节点获取opt树
     */
    @JsonProperty("parent_opt_id")
    private Integer parentOptId;

    
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
        return "pdd.goods.opt.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsOptGetResponse> getResponseClass() {
        return PddGoodsOptGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(parentOptId != null) {
            paramsMap.put("parent_opt_id", parentOptId.toString());
            
        }
        
        return paramsMap;
    }

    public void setParentOptId(Integer parentOptId) {
        this.parentOptId = parentOptId;
    }

    
    
}