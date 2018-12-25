package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdKeywordUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddAdKeywordUpdateRequest extends PopBaseHttpRequest<PddAdKeywordUpdateResponse>{

    /**
     * 0--搜索广告,1--明星店铺,2--定向广告,3--首页Banner广告（目前只支持0，暂不支持1、2、3）
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * 
     */
    @JsonProperty("keywords")
    private List<KeywordsItem> keywords;

    
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
        return "pdd.ad.keyword.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdKeywordUpdateResponse> getResponseClass() {
        return PddAdKeywordUpdateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        if(keywords != null) {
            paramsMap.put("keywords", keywords.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setKeywords(List<KeywordsItem> keywords) {
        this.keywords = keywords;
    }

    
    public static class KeywordsItem {

        /**
         * 关键字出价（厘）范围需在0.10~99.0元区间内
         */
        @JsonProperty("bid")
        private Long bid;

        /**
         * 关键词id
         */
        @JsonProperty("keyword_id")
        private Long keywordId;

        
        public void setBid(Long bid) {
            this.bid = bid;
        }

        public void setKeywordId(Long keywordId) {
            this.keywordId = keywordId;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}