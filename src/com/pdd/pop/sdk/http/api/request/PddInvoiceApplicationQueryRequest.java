package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddInvoiceApplicationQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddInvoiceApplicationQueryRequest extends PopBaseHttpRequest<PddInvoiceApplicationQueryResponse>{

    /**
     * 申请流水号
     */
    @JsonProperty("application_id")
    private Long applicationId;

    /**
     * 订单号；订单号和申请时间必填其一
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 申请状态：0-已拒绝，1-申请中，2-已同意
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * 申请开始时间, 时间戳（毫秒）
     */
    @JsonProperty("update_start_time")
    private Long updateStartTime;

    /**
     * 申请结束时间, 时间戳（毫秒）
     */
    @JsonProperty("update_end_time")
    private Long updateEndTime;

    /**
     * 页码，默认1
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页返回数目，默认50
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
        return "pdd.invoice.application.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddInvoiceApplicationQueryResponse> getResponseClass() {
        return PddInvoiceApplicationQueryResponse.class;
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
        if(updateStartTime != null) {
            paramsMap.put("update_start_time", updateStartTime.toString());
            
        }
        if(updateEndTime != null) {
            paramsMap.put("update_end_time", updateEndTime.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
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

    public void setUpdateStartTime(Long updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    public void setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    
    
}