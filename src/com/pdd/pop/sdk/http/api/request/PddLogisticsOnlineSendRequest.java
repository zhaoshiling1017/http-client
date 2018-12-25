package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddLogisticsOnlineSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddLogisticsOnlineSendRequest extends PopBaseHttpRequest<PddLogisticsOnlineSendResponse>{

    /**
     * 20150909-452750051
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 快递公司编号
     */
    @JsonProperty("logistics_id")
    private Long logisticsId;

    /**
     * 快递单号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;

    /**
     * 退货地址的id，不填则取商家默认地址
     */
    @JsonProperty("refund_address_id")
    private String refundAddressId;

    
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
        return "pdd.logistics.online.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsOnlineSendResponse> getResponseClass() {
        return PddLogisticsOnlineSendResponse.class;
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
        if(logisticsId != null) {
            paramsMap.put("logistics_id", logisticsId.toString());
            
        }
        if(trackingNumber != null) {
            paramsMap.put("tracking_number", trackingNumber.toString());
            
        }
        if(refundAddressId != null) {
            paramsMap.put("refund_address_id", refundAddressId.toString());
            
        }
        
        return paramsMap;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public void setRefundAddressId(String refundAddressId) {
        this.refundAddressId = refundAddressId;
    }

    
    
}