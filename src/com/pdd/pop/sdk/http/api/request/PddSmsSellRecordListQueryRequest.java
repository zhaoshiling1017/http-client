package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsSellRecordListQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddSmsSellRecordListQueryRequest extends PopBaseHttpRequest<PddSmsSellRecordListQueryResponse>{

    /**
     * 全部不传status
待发送 status 1
已发送 status2
已取消 status3
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * //排序  1-升序 2-倒序
     */
    @JsonProperty("order_by_send_time")
    private Integer orderBySendTime;

    /**
     * 页码数
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 单页条目数
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
        return "pdd.sms.sell.record.list.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsSellRecordListQueryResponse> getResponseClass() {
        return PddSmsSellRecordListQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(status != null) {
            paramsMap.put("status", status.toString());
            
        }
        if(orderBySendTime != null) {
            paramsMap.put("order_by_send_time", orderBySendTime.toString());
            
        }
        if(pageNumber != null) {
            paramsMap.put("page_number", pageNumber.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        
        return paramsMap;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setOrderBySendTime(Integer orderBySendTime) {
        this.orderBySendTime = orderBySendTime;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    
    
}