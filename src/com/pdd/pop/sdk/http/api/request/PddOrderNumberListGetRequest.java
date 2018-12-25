package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddOrderNumberListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddOrderNumberListGetRequest extends PopBaseHttpRequest<PddOrderNumberListGetResponse>{

    /**
     * 发货状态，1：待发货  2：已发货待签收  3：已签收 5：全部 暂时只开放待发货订单查询
     */
    @JsonProperty("order_status")
    private Integer orderStatus;

    /**
     * 返回数量，默认100。最大100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 返回页码 默认1，页码从1开始
PS：当前采用分页返回，数量和页数会一起传，如果不传，则采用默认值
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
        return "pdd.order.number.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderNumberListGetResponse> getResponseClass() {
        return PddOrderNumberListGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(orderStatus != null) {
            paramsMap.put("order_status", orderStatus.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        
        return paramsMap;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    
    
}