package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsTemplateQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddSmsTemplateQueryRequest extends PopBaseHttpRequest<PddSmsTemplateQueryResponse>{

    /**
     * 0, "优惠券", 
1, "提醒付款", 
2, "活动营销", 
3, "召唤买家成团", 
4, "新客转化", 
5, "老客召回", 
6, "流失唤醒", 
7, "用户自定义", 
8, "个性化营销", 
9, "精准客户推送"
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
        return "pdd.sms.template.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsTemplateQueryResponse> getResponseClass() {
        return PddSmsTemplateQueryResponse.class;
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