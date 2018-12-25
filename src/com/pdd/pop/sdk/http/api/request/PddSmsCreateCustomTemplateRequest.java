package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsCreateCustomTemplateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddSmsCreateCustomTemplateRequest extends PopBaseHttpRequest<PddSmsCreateCustomTemplateResponse>{

    /**
     * 短信模板名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 拼接短信内容
     */
    @JsonProperty("content")
    private List<ContentItem> content;

    
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
        return "pdd.sms.create.custom.template";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsCreateCustomTemplateResponse> getResponseClass() {
        return PddSmsCreateCustomTemplateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(name != null) {
            paramsMap.put("name", name.toString());
            
        }
        if(content != null) {
            paramsMap.put("content", content.toString());
            
        }
        
        return paramsMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(List<ContentItem> content) {
        this.content = content;
    }

    
    public static class ContentItem {

        /**
         * 短信内容
         */
        @JsonProperty("value")
        private String value;

        /**
         * 文本类型。1：自定义短信内容，2：店铺短链接，3：商品短链接，4：优惠券面额，5：优惠券到期时间
         */
        @JsonProperty("type")
        private Integer type;

        
        public void setValue(String value) {
            this.value = value;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}