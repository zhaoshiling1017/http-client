package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsSoldCountSetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsSoldCountSetRequest extends PopBaseHttpRequest<PddGoodsSoldCountSetResponse>{

    /**
     * 拼多多商品id
     */
    @JsonProperty("pdd_goods_id")
    private Long pddGoodsId;

    /**
     * 第三方商品id
     */
    @JsonProperty("out_goods_id")
    private String outGoodsId;

    /**
     * 第三方月销量
     */
    @JsonProperty("out_sold_count_month")
    private Long outSoldCountMonth;

    /**
     * 第三方总销量
     */
    @JsonProperty("out_sold_count_total")
    private Long outSoldCountTotal;

    /**
     * 第三方店铺名称
     */
    @JsonProperty("out_mall_name")
    private String outMallName;

    /**
     * 商品来源平台，0，1，2，3，4，5，6，7
     */
    @JsonProperty("out_source_type")
    private Integer outSourceType;

    
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
        return "pdd.goods.sold.count.set";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSoldCountSetResponse> getResponseClass() {
        return PddGoodsSoldCountSetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(pddGoodsId != null) {
            paramsMap.put("pdd_goods_id", pddGoodsId.toString());
            
        }
        if(outGoodsId != null) {
            paramsMap.put("out_goods_id", outGoodsId.toString());
            
        }
        if(outSoldCountMonth != null) {
            paramsMap.put("out_sold_count_month", outSoldCountMonth.toString());
            
        }
        if(outSoldCountTotal != null) {
            paramsMap.put("out_sold_count_total", outSoldCountTotal.toString());
            
        }
        if(outMallName != null) {
            paramsMap.put("out_mall_name", outMallName.toString());
            
        }
        if(outSourceType != null) {
            paramsMap.put("out_source_type", outSourceType.toString());
            
        }
        
        return paramsMap;
    }

    public void setPddGoodsId(Long pddGoodsId) {
        this.pddGoodsId = pddGoodsId;
    }

    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId;
    }

    public void setOutSoldCountMonth(Long outSoldCountMonth) {
        this.outSoldCountMonth = outSoldCountMonth;
    }

    public void setOutSoldCountTotal(Long outSoldCountTotal) {
        this.outSoldCountTotal = outSoldCountTotal;
    }

    public void setOutMallName(String outMallName) {
        this.outMallName = outMallName;
    }

    public void setOutSourceType(Integer outSourceType) {
        this.outSourceType = outSourceType;
    }

    
    
}