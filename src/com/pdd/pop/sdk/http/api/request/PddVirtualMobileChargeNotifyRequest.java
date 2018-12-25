package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddVirtualMobileChargeNotifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddVirtualMobileChargeNotifyRequest extends PopBaseHttpRequest<PddVirtualMobileChargeNotifyResponse>{

    /**
     * 拼多多订单编码
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 11122dafa 外部系统订单编码
     */
    @JsonProperty("outer_order_sn")
    private String outerOrderSn;

    /**
     * 虚拟系统充值结果，SUCCESS-充值成功，FAIL-充值失败
     */
    @JsonProperty("status")
    private String status;

    
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
        return "pdd.virtual.mobile.charge.notify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVirtualMobileChargeNotifyResponse> getResponseClass() {
        return PddVirtualMobileChargeNotifyResponse.class;
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
        if(outerOrderSn != null) {
            paramsMap.put("outer_order_sn", outerOrderSn.toString());
            
        }
        if(status != null) {
            paramsMap.put("status", status.toString());
            
        }
        
        return paramsMap;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOuterOrderSn(String outerOrderSn) {
        this.outerOrderSn = outerOrderSn;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
}