package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsCustomSettingResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddSmsCustomSettingRequest extends PopBaseHttpRequest<PddSmsCustomSettingResponse>{

    /**
     * 模板id
     */
    @JsonProperty("template_id")
    private Long templateId;

    /**
     * 待发送手机号，["15671551276"]
     */
    @JsonProperty("phones")
    private List<String> phones;

    /**
     * 发送时间
     */
    @JsonProperty("send_time")
    private String sendTime;

    /**
     * //短信模版类型， 1-官方模版，2-自定义模版
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
        return "pdd.sms.custom.setting";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsCustomSettingResponse> getResponseClass() {
        return PddSmsCustomSettingResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(templateId != null) {
            paramsMap.put("template_id", templateId.toString());
            
        }
        if(phones != null) {
            paramsMap.put("phones", JsonUtil.transferToJson(phones));
            
        }
        if(sendTime != null) {
            paramsMap.put("send_time", sendTime.toString());
            
        }
        if(templateType != null) {
            paramsMap.put("template_type", templateType.toString());
            
        }
        
        return paramsMap;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    
    
}