package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsSendRecordListQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddSmsSendRecordListQueryRequest extends PopBaseHttpRequest<PddSmsSendRecordListQueryResponse>{

    /**
     * 场景id,见前面枚举值用户关怀传[1,3]  ,智能营销[4, 5, 6, 8，9] 不传的话全部
     */
    @JsonProperty("scene")
    private List<Long> scene;

    /**
     * 开始时间 2018-08-09 15:20:12
     */
    @JsonProperty("start_time")
    private String startTime;

    /**
     * 结束时间 2018-08-09 15:20:12
     */
    @JsonProperty("end_time")
    private String endTime;

    /**
     * 1-成功 2-失败 全部-不传
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * 页码
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 每页数量
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
        return "pdd.sms.send.record.list.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsSendRecordListQueryResponse> getResponseClass() {
        return PddSmsSendRecordListQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(scene != null) {
            paramsMap.put("scene", scene.toString());
            
        }
        if(startTime != null) {
            paramsMap.put("start_time", startTime.toString());
            
        }
        if(endTime != null) {
            paramsMap.put("end_time", endTime.toString());
            
        }
        if(status != null) {
            paramsMap.put("status", status.toString());
            
        }
        if(pageNumber != null) {
            paramsMap.put("page_number", pageNumber.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        
        return paramsMap;
    }

    public void setScene(List<Long> scene) {
        this.scene = scene;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    
    
}