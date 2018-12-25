package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkThemeListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddDdkThemeListGetRequest extends PopBaseHttpRequest<PddDdkThemeListGetResponse>{

    /**
     * 返回的一页数据数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 返回的页码
     */
    @JsonProperty("page")
    private Integer page;

    
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
        return "pdd.ddk.theme.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkThemeListGetResponse> getResponseClass() {
        return PddDdkThemeListGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        
        return paramsMap;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    
    
}