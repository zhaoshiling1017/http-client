package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddLogisticsTicketImageUploadResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddLogisticsTicketImageUploadRequest extends PopBaseHttpRequest<PddLogisticsTicketImageUploadResponse>{

    /**
     * 支持格式有：jpg/jpeg、png等图片格式，入参为图片的base64编码，最大支持1M
     */
    @JsonProperty("image")
    private String image;

    
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
        return "pdd.logistics.ticket.image.upload";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsTicketImageUploadResponse> getResponseClass() {
        return PddLogisticsTicketImageUploadResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(image != null) {
            paramsMap.put("image", image.toString());
            
        }
        
        return paramsMap;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
    
}