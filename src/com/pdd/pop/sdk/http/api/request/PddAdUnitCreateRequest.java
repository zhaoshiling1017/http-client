package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdUnitCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddAdUnitCreateRequest extends PopBaseHttpRequest<PddAdUnitCreateResponse>{

    /**
     * 推广类型，0-搜索推广，2-展示推广
scene type为0的时候，keywords必填，bid不用填；scene type为2的时候，keywords不用填，bid必填
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * 计划id
     */
    @JsonProperty("plan_id")
    private Long planId;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * [{"word":"test","bid":200}]
     */
    @JsonProperty("keywords")
    private List<KeywordsItem> keywords;

    /**
     * 创意列表 [{"image_url":"123.jpg","title":"test"}]
     */
    @JsonProperty("creative_list")
    private List<CreativeListItem> creativeList;

    /**
     * 通投单元出价，单位厘，出价需在0.10~99.0元区间内。展示推广必填
     */
    @JsonProperty("bid")
    private Long bid;

    
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
        return "pdd.ad.unit.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdUnitCreateResponse> getResponseClass() {
        return PddAdUnitCreateResponse.class;
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
        if(planId != null) {
            paramsMap.put("plan_id", planId.toString());
            
        }
        if(goodsId != null) {
            paramsMap.put("goods_id", goodsId.toString());
            
        }
        if(keywords != null) {
            paramsMap.put("keywords", keywords.toString());
            
        }
        if(creativeList != null) {
            paramsMap.put("creative_list", creativeList.toString());
            
        }
        if(bid != null) {
            paramsMap.put("bid", bid.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setKeywords(List<KeywordsItem> keywords) {
        this.keywords = keywords;
    }

    public void setCreativeList(List<CreativeListItem> creativeList) {
        this.creativeList = creativeList;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    
    public static class KeywordsItem {

        /**
         * 关键字出价（厘）范围需在0.10~99.0元区间内
         */
        @JsonProperty("bid")
        private Long bid;

        /**
         * 关键词
         */
        @JsonProperty("word")
        private String word;

        
        public void setBid(Long bid) {
            this.bid = bid;
        }

        public void setWord(String word) {
            this.word = word;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    public static class CreativeListItem {

        /**
         * 图片地址
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 标题
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