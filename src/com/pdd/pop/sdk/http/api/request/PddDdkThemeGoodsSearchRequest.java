package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkThemeGoodsSearchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddDdkThemeGoodsSearchRequest extends PopBaseHttpRequest<PddDdkThemeGoodsSearchResponse>{

    /**
     * 主题ID
     */
    @JsonProperty("theme_id")
    private Long themeId;

    
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
        return "pdd.ddk.theme.goods.search";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkThemeGoodsSearchResponse> getResponseClass() {
        return PddDdkThemeGoodsSearchResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(themeId != null) {
            paramsMap.put("theme_id", themeId.toString());
            
        }
        
        return paramsMap;
    }

    public void setThemeId(Long themeId) {
        this.themeId = themeId;
    }

    
    
}