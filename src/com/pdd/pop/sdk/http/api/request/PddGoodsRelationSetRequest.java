package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsRelationSetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsRelationSetRequest extends PopBaseHttpRequest<PddGoodsRelationSetResponse>{

    /**
     * 拼多多商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 外部平台商品id
     */
    @JsonProperty("out_goods_id")
    private String outGoodsId;

    /**
     * 外部平台商品url
     */
    @JsonProperty("out_detail_url")
    private String outDetailUrl;

    /**
     * 外部平台商品最低价，单位：分
     */
    @JsonProperty("out_low_goods_price")
    private Long outLowGoodsPrice;

    /**
     * 外部平台商品最高价，单位：分
     */
    @JsonProperty("out_high_goods_price")
    private Long outHighGoodsPrice;

    /**
     * 外部平台枚举值， 淘宝/天猫 0，京东1，1688 2，唯品会3，苏宁4，亚马逊,5，网易6，其他7
     */
    @JsonProperty("source_type")
    private Integer sourceType;

    /**
     * 邮费
     */
    @JsonProperty("postage")
    private Long postage;

    
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
        return "pdd.goods.relation.set";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsRelationSetResponse> getResponseClass() {
        return PddGoodsRelationSetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(goodsId != null) {
            paramsMap.put("goods_id", goodsId.toString());
            
        }
        if(outGoodsId != null) {
            paramsMap.put("out_goods_id", outGoodsId.toString());
            
        }
        if(outDetailUrl != null) {
            paramsMap.put("out_detail_url", outDetailUrl.toString());
            
        }
        if(outLowGoodsPrice != null) {
            paramsMap.put("out_low_goods_price", outLowGoodsPrice.toString());
            
        }
        if(outHighGoodsPrice != null) {
            paramsMap.put("out_high_goods_price", outHighGoodsPrice.toString());
            
        }
        if(sourceType != null) {
            paramsMap.put("source_type", sourceType.toString());
            
        }
        if(postage != null) {
            paramsMap.put("postage", postage.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId;
    }

    public void setOutDetailUrl(String outDetailUrl) {
        this.outDetailUrl = outDetailUrl;
    }

    public void setOutLowGoodsPrice(Long outLowGoodsPrice) {
        this.outLowGoodsPrice = outLowGoodsPrice;
    }

    public void setOutHighGoodsPrice(Long outHighGoodsPrice) {
        this.outHighGoodsPrice = outHighGoodsPrice;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public void setPostage(Long postage) {
        this.postage = postage;
    }

    
    
}