package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddStockDepotPriorityListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddStockDepotPriorityListRequest extends PopBaseHttpRequest<PddStockDepotPriorityListResponse>{

    /**
     * 省id
     */
    @JsonProperty("province_id")
    private Integer provinceId;

    /**
     * 市id
     */
    @JsonProperty("city_id")
    private Integer cityId;

    /**
     * 区id
     */
    @JsonProperty("district_id")
    private Integer districtId;

    /**
     * 仓库编码
     */
    @JsonProperty("depot_code")
    private String depotCode;

    /**
     * 每页数据显示数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 当前页数 从1开始
     */
    @JsonProperty("page_num")
    private Integer pageNum;

    
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
        return "pdd.stock.depot.priority.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockDepotPriorityListResponse> getResponseClass() {
        return PddStockDepotPriorityListResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(provinceId != null) {
            paramsMap.put("province_id", provinceId.toString());
            
        }
        if(cityId != null) {
            paramsMap.put("city_id", cityId.toString());
            
        }
        if(districtId != null) {
            paramsMap.put("district_id", districtId.toString());
            
        }
        if(depotCode != null) {
            paramsMap.put("depot_code", depotCode.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(pageNum != null) {
            paramsMap.put("page_num", pageNum.toString());
            
        }
        
        return paramsMap;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public void setDepotCode(String depotCode) {
        this.depotCode = depotCode;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    
    
}