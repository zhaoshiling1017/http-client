package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddUtilDivideImageResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddUtilDivideImageRequest extends PopBaseHttpRequest<PddUtilDivideImageResponse>{

    /**
     * "http://pfs.htj.yiran.com/open_platform/2018-10-21/a648bc89-3c92-4e7f-bc8a-fd91e28c776f.png"
     */
    @JsonProperty("image_url")
    private String imageUrl;

    
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
        return "pdd.util.divide.image";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddUtilDivideImageResponse> getResponseClass() {
        return PddUtilDivideImageResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(imageUrl != null) {
            paramsMap.put("image_url", imageUrl.toString());
            
        }
        
        return paramsMap;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    
    
}