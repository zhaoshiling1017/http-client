package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdKeywordRelevanceGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddAdKeywordRelevanceGetRequest extends PopBaseHttpRequest<PddAdKeywordRelevanceGetResponse>{

    /**
     * 0--搜索广告,1--明星店铺,2--定向广告,3--首页Banner广告（目前只支持0，暂不支持1、2、3）
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * ["test"]
     */
    @JsonProperty("words")
    private List<String> words;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    
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
        return "pdd.ad.keyword.relevance.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdKeywordRelevanceGetResponse> getResponseClass() {
        return PddAdKeywordRelevanceGetResponse.class;
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
        if(words != null) {
            paramsMap.put("words", JsonUtil.transferToJson(words));
            
        }
        if(goodsId != null) {
            paramsMap.put("goods_id", goodsId.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    
    
}