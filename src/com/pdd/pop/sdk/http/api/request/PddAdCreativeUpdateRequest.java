package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdCreativeUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdCreativeUpdateRequest extends PopBaseHttpRequest<PddAdCreativeUpdateResponse>{

    /**
     * 
     */
    @JsonProperty("creative_id")
    private Long creativeId;

    /**
     * 0:搜索广告
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * jsonObject 的json string。 示例：{"title":"ceshi","image_url":"https://img12.360buyimg.com/n7/g14/M07/16/00/rBEhVlJfpdwIAAAAAADurQhBHX0AAETNABbGNkAAO7F355.jpg"}
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
        return "pdd.ad.creative.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdCreativeUpdateResponse> getResponseClass() {
        return PddAdCreativeUpdateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(creativeId != null) {
            paramsMap.put("creative_id", creativeId.toString());
            
        }
        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        if(creative != null) {
            paramsMap.put("creative", creative.toString());
            
        }
        
        return paramsMap;
    }

    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setCreative(Creative creative) {
        this.creative = creative;
    }

    
    public static class Creative {

        /**
         * 图片地址
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 
         */
        @JsonProperty("title")
        private String title;

        
        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}