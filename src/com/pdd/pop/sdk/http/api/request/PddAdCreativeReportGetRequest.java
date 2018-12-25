package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdCreativeReportGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdCreativeReportGetRequest extends PopBaseHttpRequest<PddAdCreativeReportGetResponse>{

    /**
     * 开始时间 2018-01-01
     */
    @JsonProperty("begin_date")
    private String beginDate;

    /**
     * 结束时间 2018-01-01
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * 页面大小,默认100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 页面数,默认1
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    
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
        return "pdd.ad.creative.report.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdCreativeReportGetResponse> getResponseClass() {
        return PddAdCreativeReportGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(beginDate != null) {
            paramsMap.put("begin_date", beginDate.toString());
            
        }
        if(endDate != null) {
            paramsMap.put("end_date", endDate.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(pageNumber != null) {
            paramsMap.put("page_number", pageNumber.toString());
            
        }
        
        return paramsMap;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    
    
}