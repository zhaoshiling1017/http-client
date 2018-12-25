package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddErpOrderSyncResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddErpOrderSyncRequest extends PopBaseHttpRequest<PddErpOrderSyncResponse>{

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 订单状态：1-已打单
     */
    @JsonProperty("order_state")
    private Integer orderState;

    /**
     * 运单号
     */
    @JsonProperty("waybill_no")
    private String waybillNo;

    /**
     * 物流公司编码
     */
    @JsonProperty("logistics_id")
    private Long logisticsId;

    
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
        return "pdd.erp.order.sync";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddErpOrderSyncResponse> getResponseClass() {
        return PddErpOrderSyncResponse.class;
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
        if(orderState != null) {
            paramsMap.put("order_state", orderState.toString());
            
        }
        if(waybillNo != null) {
            paramsMap.put("waybill_no", waybillNo.toString());
            
        }
        if(logisticsId != null) {
            paramsMap.put("logistics_id", logisticsId.toString());
            
        }
        
        return paramsMap;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    
    
}