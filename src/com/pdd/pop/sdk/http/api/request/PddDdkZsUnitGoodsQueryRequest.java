package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkZsUnitGoodsQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddDdkZsUnitGoodsQueryRequest extends PopBaseHttpRequest<PddDdkZsUnitGoodsQueryResponse>{

    /**
     * 招商多多客id
     */
    @JsonProperty("zs_duo_id")
    private Long zsDuoId;

    /**
     * 页码，默认为1
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页个数，默认100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    
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
        return "pdd.ddk.zs.unit.goods.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkZsUnitGoodsQueryResponse> getResponseClass() {
        return PddDdkZsUnitGoodsQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(zsDuoId != null) {
            paramsMap.put("zs_duo_id", zsDuoId.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        
        return paramsMap;
    }

    public void setZsDuoId(Long zsDuoId) {
        this.zsDuoId = zsDuoId;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    
    
}