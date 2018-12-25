package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdCreativeCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdCreativeCreateRequest extends PopBaseHttpRequest<PddAdCreativeCreateResponse>{

    /**
     * 单元id
     */
    @JsonProperty("unit_id")
    private Long unitId;

    /**
     * 0:搜索广告
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * jsonObject 的json string。示例：{"title":"ceshi","image_url":"https://img12.360buyimg.com/n7/g14/M07/16/00/rBEhVlJfpdwIAAAAAADurQhBHX0AAETNABbGNkAAO7F355.jpg"}
     */
    @JsonProperty("creative")
    private Creative creative;

    
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
        return "pdd.ad.creative.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdCreativeCreateResponse> getResponseClass() {
        return PddAdCreativeCreateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(unitId != null) {
            paramsMap.put("unit_id", unitId.toString());
            
        }
        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        if(creative != null) {
            paramsMap.put("creative", creative.toString());
            
        }
        
        return paramsMap;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setCreative(Creative creative) {
        this.creative = creative;
    }

    
    public static class Creative {

        /**
         * 
         */
        @JsonProperty("title")
        private String title;

        /**
         * 图片地址
         */
        @JsonProperty("image_url")
        private String imageUrl;

        
        public void setTitle(String title) {
            this.title = title;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}