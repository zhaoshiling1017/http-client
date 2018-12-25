package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdChartBykeywordGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdChartBykeywordGetRequest extends PopBaseHttpRequest<PddAdChartBykeywordGetResponse>{

    /**
     * 报表日期，仅能查询近30天的报表数据，格式为：YYYY-MM-DD
     */
    @JsonProperty("date")
    private String date;

    /**
     * 返回页数，默认1页
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页返回条数，默认20条
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
        return "pdd.ad.chart.bykeyword.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdChartBykeywordGetResponse> getResponseClass() {
        return PddAdChartBykeywordGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(date != null) {
            paramsMap.put("date", date.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        
        return paramsMap;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    
    
}