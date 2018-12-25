package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsRemainSettingResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddSmsRemainSettingRequest extends PopBaseHttpRequest<PddSmsRemainSettingResponse>{

    /**
     * 买家未付款时间，单位为分钟。例，unpaid_duration=3，买家下单后3分钟未付款，即发送短信提醒买家付款
     */
    @JsonProperty("unpaid_duration")
    private String unpaidDuration;

    /**
     * 指定的短信任务的模板id
     */
    @JsonProperty("template_id")
    private String templateId;

    /**
     * 该提醒任务是否处于处于打开状态，0-关闭，此时提醒任务被关闭，1-打开，此时提醒任务打开
     */
    @JsonProperty("open")
    private Integer open;

    /**
     * 该任务对应的场景//1-提醒付款 3-召唤买家成团
     */
    @JsonProperty("scene")
    private Integer scene;

    /**
     * operate_type// 1-开启任务   2-编辑
     */
    @JsonProperty("operate_type")
    private Integer operateType;

    
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
        return "pdd.sms.remain.setting";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsRemainSettingResponse> getResponseClass() {
        return PddSmsRemainSettingResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(unpaidDuration != null) {
            paramsMap.put("unpaid_duration", unpaidDuration.toString());
            
        }
        if(templateId != null) {
            paramsMap.put("template_id", templateId.toString());
            
        }
        if(open != null) {
            paramsMap.put("open", open.toString());
            
        }
        if(scene != null) {
            paramsMap.put("scene", scene.toString());
            
        }
        if(operateType != null) {
            paramsMap.put("operate_type", operateType.toString());
            
        }
        
        return paramsMap;
    }

    public void setUnpaidDuration(String unpaidDuration) {
        this.unpaidDuration = unpaidDuration;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    
    
}