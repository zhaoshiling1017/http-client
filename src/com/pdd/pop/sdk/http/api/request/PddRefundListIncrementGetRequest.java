package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddRefundListIncrementGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddRefundListIncrementGetRequest extends PopBaseHttpRequest<PddRefundListIncrementGetResponse>{

    /**
     * 必填，售后状态  1：全部 2：买家申请退款，待商家处理 3：退货退款，待商家处理 4：商家同意退款，退款中 5：平台同意退款，退款中 6：驳回退款， 待买家处理 7：已同意退货退款,待用户发货 8：平台处理中 9：平台拒 绝退款，退款关闭 10：退款成功 11：买家撤销 12：买家逾期未处 理，退款失败 13：买家逾期，超过有效期 14 : 换货补寄待商家处理 15:换货补寄待用户处理 16:换货补寄成功 17:换货补寄失败 18:换货补寄待用户确认完成
     */
    @JsonProperty("after_sales_status")
    private String afterSalesStatus;

    /**
     * 必填，售后类型 1：全部 2：仅退款 3：退货退款 4：换货 5：缺货补寄
     */
    @JsonProperty("after_sales_type")
    private String afterSalesType;

    /**
     * 必填，最后更新时间开始时间的UNIX时间戳，指格林威治时间 1970 年01月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00分 00 秒)起至现在的总秒数
     */
    @JsonProperty("start_updated_at")
    private Long startUpdatedAt;

    /**
     * 必填，最后更新时间结束时间的UNIX时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时00 分 00 秒)起至现在的总秒数 PS：开始时间结束时间间距不超过 30 分钟
     */
    @JsonProperty("end_updated_at")
    private Long endUpdatedAt;

    /**
     * 返回数量，默认 100。最大 100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 返回页码 默认 1，页码从 1 开始 PS：当前采用分页返回，数量和页数会一起传，如果不传，则采用 默认值
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
        return "pdd.refund.list.increment.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRefundListIncrementGetResponse> getResponseClass() {
        return PddRefundListIncrementGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(afterSalesStatus != null) {
            paramsMap.put("after_sales_status", afterSalesStatus.toString());
            
        }
        if(afterSalesType != null) {
            paramsMap.put("after_sales_type", afterSalesType.toString());
            
        }
        if(startUpdatedAt != null) {
            paramsMap.put("start_updated_at", startUpdatedAt.toString());
            
        }
        if(endUpdatedAt != null) {
            paramsMap.put("end_updated_at", endUpdatedAt.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        
        return paramsMap;
    }

    public void setAfterSalesStatus(String afterSalesStatus) {
        this.afterSalesStatus = afterSalesStatus;
    }

    public void setAfterSalesType(String afterSalesType) {
        this.afterSalesType = afterSalesType;
    }

    public void setStartUpdatedAt(Long startUpdatedAt) {
        this.startUpdatedAt = startUpdatedAt;
    }

    public void setEndUpdatedAt(Long endUpdatedAt) {
        this.endUpdatedAt = endUpdatedAt;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    
    
}