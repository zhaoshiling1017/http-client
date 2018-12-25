package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddInvoiceApplicationUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddInvoiceApplicationUpdateRequest extends PopBaseHttpRequest<PddInvoiceApplicationUpdateResponse>{

    /**
     * 申请流水号
     */
    @JsonProperty("application_id")
    private Long applicationId;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 审核结果：0 = 拒绝，2 = 同意
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * 驳回原因，status=0必填
     */
    @JsonProperty("reason")
    private String reason;

    
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
        return "pdd.invoice.application.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddInvoiceApplicationUpdateResponse> getResponseClass() {
        return PddInvoiceApplicationUpdateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(applicationId != null) {
            paramsMap.put("application_id", applicationId.toString());
            
        }
        if(orderSn != null) {
            paramsMap.put("order_sn", orderSn.toString());
            
        }
        if(status != null) {
            paramsMap.put("status", status.toString());
            
        }
        if(reason != null) {
            paramsMap.put("reason", reason.toString());
            
        }
        
        return paramsMap;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    
    
}