package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsSellSettingResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddSmsSellSettingRequest extends PopBaseHttpRequest<PddSmsSellSettingResponse>{

    /**
     * 4-新客转化 5-老客转回 6-流失唤醒 8-个性化营销
     */
    @JsonProperty("scene")
    private Integer scene;

    /**
     * 人群id，个性化营销短信必填
     */
    @JsonProperty("crowd_id")
    private Long crowdId;

    /**
     * 发送时间 必填
     */
    @JsonProperty("send_time")
    private String sendTime;

    /**
     * 短信模板id
     */
    @JsonProperty("template_id")
    private Integer templateId;

    /**
     * 短信模版类型， 1-官方模版，2-自定义模版
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
        return "pdd.sms.sell.setting";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsSellSettingResponse> getResponseClass() {
        return PddSmsSellSettingResponse.class;
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
        if(crowdId != null) {
            paramsMap.put("crowd_id", crowdId.toString());
            
        }
        if(sendTime != null) {
            paramsMap.put("send_time", sendTime.toString());
            
        }
        if(templateId != null) {
            paramsMap.put("template_id", templateId.toString());
            
        }
        if(templateType != null) {
            paramsMap.put("template_type", templateType.toString());
            
        }
        
        return paramsMap;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public void setCrowdId(Long crowdId) {
        this.crowdId = crowdId;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    
    
}