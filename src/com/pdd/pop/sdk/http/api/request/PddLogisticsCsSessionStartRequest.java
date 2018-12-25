package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddLogisticsCsSessionStartResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddLogisticsCsSessionStartRequest extends PopBaseHttpRequest<PddLogisticsCsSessionStartResponse>{

    /**
     * pdd会话id
     */
    @JsonProperty("session_id")
    private String sessionId;

    /**
     * 物流公司会话id
     */
    @JsonProperty("wp_session_id")
    private String wpSessionId;

    /**
     * 样式YYYY-MM-DD HH:MM:SS
     */
    @JsonProperty("action_time")
    private String actionTime;

    /**
     * 可选值：1：已分配 2：排队中 3：分配异常
     */
    @JsonProperty("biz_type")
    private Integer bizType;

    /**
     * 客服id，biz_type为1时必填
     */
    @JsonProperty("dealer_id")
    private String dealerId;

    /**
     * 队列id，biz_type为1时必填
     */
    @JsonProperty("queue_id")
    private String queueId;

    /**
     * 网点名，biz_type为1时必填
     */
    @JsonProperty("queue_name")
    private String queueName;

    /**
     * 排队位置，biz_type为2时必填
     */
    @JsonProperty("queue_index")
    private Integer queueIndex;

    /**
     * 分配遇到的异常，示例：33222，biz_type为3时不为空
     */
    @JsonProperty("exception_code")
    private Integer exceptionCode;

    /**
     * 物流客服系统遇到的异常，biz_type为3时不为空
     */
    @JsonProperty("exception_msg")
    private String exceptionMsg;

    /**
     * 接待的网点地址，biz_type为1时必填，示例: ”河南省”
     */
    @JsonProperty("queue_address")
    private String queueAddress;

    
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
        return "pdd.logistics.cs.session.start";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsCsSessionStartResponse> getResponseClass() {
        return PddLogisticsCsSessionStartResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(sessionId != null) {
            paramsMap.put("session_id", sessionId.toString());
            
        }
        if(wpSessionId != null) {
            paramsMap.put("wp_session_id", wpSessionId.toString());
            
        }
        if(actionTime != null) {
            paramsMap.put("action_time", actionTime.toString());
            
        }
        if(bizType != null) {
            paramsMap.put("biz_type", bizType.toString());
            
        }
        if(dealerId != null) {
            paramsMap.put("dealer_id", dealerId.toString());
            
        }
        if(queueId != null) {
            paramsMap.put("queue_id", queueId.toString());
            
        }
        if(queueName != null) {
            paramsMap.put("queue_name", queueName.toString());
            
        }
        if(queueIndex != null) {
            paramsMap.put("queue_index", queueIndex.toString());
            
        }
        if(exceptionCode != null) {
            paramsMap.put("exception_code", exceptionCode.toString());
            
        }
        if(exceptionMsg != null) {
            paramsMap.put("exception_msg", exceptionMsg.toString());
            
        }
        if(queueAddress != null) {
            paramsMap.put("queue_address", queueAddress.toString());
            
        }
        
        return paramsMap;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setWpSessionId(String wpSessionId) {
        this.wpSessionId = wpSessionId;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public void setQueueIndex(Integer queueIndex) {
        this.queueIndex = queueIndex;
    }

    public void setExceptionCode(Integer exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public void setQueueAddress(String queueAddress) {
        this.queueAddress = queueAddress;
    }

    
    
}