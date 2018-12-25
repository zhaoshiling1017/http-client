package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddStockWareListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddStockWareListRequest extends PopBaseHttpRequest<PddStockWareListResponse>{

    /**
     * 货品id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 货品编码
     */
    @JsonProperty("ware_sn")
    private String wareSn;

    /**
     * 货品名称
     */
    @JsonProperty("ware_name")
    private String wareName;

    /**
     * 类型 0:单独货品。1:组合货品
     */
    @JsonProperty("ware_type")
    private Integer wareType;

    /**
     * 页数，从1开始
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页记录数
     */
    @JsonProperty("size")
    private Integer size;

    
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
        return "pdd.stock.ware.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareListResponse> getResponseClass() {
        return PddStockWareListResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(id != null) {
            paramsMap.put("id", id.toString());
            
        }
        if(wareSn != null) {
            paramsMap.put("ware_sn", wareSn.toString());
            
        }
        if(wareName != null) {
            paramsMap.put("ware_name", wareName.toString());
            
        }
        if(wareType != null) {
            paramsMap.put("ware_type", wareType.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        if(size != null) {
            paramsMap.put("size", size.toString());
            
        }
        
        return paramsMap;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWareSn(String wareSn) {
        this.wareSn = wareSn;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public void setWareType(Integer wareType) {
        this.wareType = wareType;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    
    
}