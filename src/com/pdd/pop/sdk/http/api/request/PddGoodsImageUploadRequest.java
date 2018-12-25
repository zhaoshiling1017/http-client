package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsImageUploadResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsImageUploadRequest extends PopBaseHttpRequest<PddGoodsImageUploadResponse>{

    /**
     * 支持格式有：jpg/jpeg、png等图片格式，注意入参图片必须转码为base64编码
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
        return "pdd.goods.image.upload";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsImageUploadResponse> getResponseClass() {
        return PddGoodsImageUploadResponse.class;
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