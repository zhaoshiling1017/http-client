package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddOrderListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddOrderListGetRequest extends PopBaseHttpRequest<PddOrderListGetResponse>{

    /**
     * 发货状态，1：待发货，2：已发货待签收，3：已签收 5：全部
     */
    @JsonProperty("order_status")
    private Integer orderStatus;

    /**
     * 售后状态 1：无售后或售后关闭，2：售后处理中，3：退款中，4： 退款成功 5：全部
     */
    @JsonProperty("refund_status")
    private Integer refundStatus;

    /**
     * 必填，成交时间开始时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("start_confirm_at")
    private Long startConfirmAt;

    /**
     * 必填，成交时间结束时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数 PS：开始时间结束时间间距不超过 24 小时
     */
    @JsonProperty("end_confirm_at")
    private Long endConfirmAt;

    /**
     * 返回页码 默认 1，页码从 1 开始 PS：当前采用分页返回，数量和页数会一起传，如果不传，则采用 默认值
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 返回数量，默认 100。最大 100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 订单类型 0-普通订单 ，1- 定金订单
     */
    @JsonProperty("trade_type")
    private Integer tradeType;

    
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
        return "pdd.order.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderListGetResponse> getResponseClass() {
        return PddOrderListGetResponse.class;
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
        if(refundStatus != null) {
            paramsMap.put("refund_status", refundStatus.toString());
            
        }
        if(startConfirmAt != null) {
            paramsMap.put("start_confirm_at", startConfirmAt.toString());
            
        }
        if(endConfirmAt != null) {
            paramsMap.put("end_confirm_at", endConfirmAt.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(tradeType != null) {
            paramsMap.put("trade_type", tradeType.toString());
            
        }
        
        return paramsMap;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setStartConfirmAt(Long startConfirmAt) {
        this.startConfirmAt = startConfirmAt;
    }

    public void setEndConfirmAt(Long endConfirmAt) {
        this.endConfirmAt = endConfirmAt;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    
    
}