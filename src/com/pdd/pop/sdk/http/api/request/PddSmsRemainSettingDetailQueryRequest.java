package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsRemainSettingDetailQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddSmsRemainSettingDetailQueryRequest extends PopBaseHttpRequest<PddSmsRemainSettingDetailQueryResponse>{

    /**
     * //1：提醒付款 ；  3：召唤买家成团
     */
    @JsonProperty("scene")
    private Integer scene;

    
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
        return "pdd.sms.remain.setting.detail.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsRemainSettingDetailQueryResponse> getResponseClass() {
        return PddSmsRemainSettingDetailQueryResponse.class;
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
        
        return paramsMap;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    
    
}