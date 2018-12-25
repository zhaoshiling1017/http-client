package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddRefundStatusCheckResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddRefundStatusCheckRequest extends PopBaseHttpRequest<PddRefundStatusCheckResponse>{

    /**
     * 20150909-452750051,20150909-452750134 用逗号分开
     */
    @JsonProperty("order_sns")
    private String orderSns;

    
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
        return "pdd.refund.status.check";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRefundStatusCheckResponse> getResponseClass() {
        return PddRefundStatusCheckResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(orderSns != null) {
            paramsMap.put("order_sns", orderSns.toString());
            
        }
        
        return paramsMap;
    }

    public void setOrderSns(String orderSns) {
        this.orderSns = orderSns;
    }

    
    
}