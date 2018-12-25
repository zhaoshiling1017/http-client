package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsGetRelationResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddGoodsGetRelationRequest extends PopBaseHttpRequest<PddGoodsGetRelationResponse>{

    /**
     * 拼多多商品id
     */
    @JsonProperty("pdd_goods_id")
    private List<Long> pddGoodsId;

    
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
        return "pdd.goods.get.relation";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsGetRelationResponse> getResponseClass() {
        return PddGoodsGetRelationResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(pddGoodsId != null) {
            paramsMap.put("pdd_goods_id", pddGoodsId.toString());
            
        }
        
        return paramsMap;
    }

    public void setPddGoodsId(List<Long> pddGoodsId) {
        this.pddGoodsId = pddGoodsId;
    }

    
    
}