package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddInvoiceDetailQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddInvoiceDetailQueryRequest extends PopBaseHttpRequest<PddInvoiceDetailQueryResponse>{

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 发票流水号
     */
    @JsonProperty("serial_no")
    private String serialNo;

    
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
        return "pdd.invoice.detail.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddInvoiceDetailQueryResponse> getResponseClass() {
        return PddInvoiceDetailQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(orderSn != null) {
            paramsMap.put("order_sn", orderSn.toString());
            
        }
        if(serialNo != null) {
            paramsMap.put("serial_no", serialNo.toString());
            
        }
        
        return paramsMap;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    
    
}