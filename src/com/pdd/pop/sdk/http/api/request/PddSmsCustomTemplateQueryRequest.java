package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsCustomTemplateQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddSmsCustomTemplateQueryRequest extends PopBaseHttpRequest<PddSmsCustomTemplateQueryResponse>{

    /**
     * //1-审核中  2-审核驳回  3-审核通过
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * true or false//审核通过的排前面，在模版选择的时候调用
     */
    @JsonProperty("order_by_status")
    private Boolean orderByStatus;

    /**
     * 页码
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 每页大小
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 自定义模板类型
0,正常模板
1,需要带优惠券类型的模板
     */
    @JsonProperty("template_type")
    private Integer templateType;

    
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
        return "pdd.sms.custom.template.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsCustomTemplateQueryResponse> getResponseClass() {
        return PddSmsCustomTemplateQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(status != null) {
            paramsMap.put("status", status.toString());
            
        }
        if(orderByStatus != null) {
            paramsMap.put("order_by_status", orderByStatus.toString());
            
        }
        if(pageNumber != null) {
            paramsMap.put("page_number", pageNumber.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(templateType != null) {
            paramsMap.put("template_type", templateType.toString());
            
        }
        
        return paramsMap;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setOrderByStatus(Boolean orderByStatus) {
        this.orderByStatus = orderByStatus;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    
    
}