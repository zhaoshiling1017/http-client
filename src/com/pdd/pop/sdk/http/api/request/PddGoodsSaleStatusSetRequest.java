package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsSaleStatusSetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsSaleStatusSetRequest extends PopBaseHttpRequest<PddGoodsSaleStatusSetResponse>{

    /**
     * 拼多多商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 上下架状态：1:上架 0:下架
     */
    @JsonProperty("is_onsale")
    private Integer isOnsale;

    
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
        return "pdd.goods.sale.status.set";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSaleStatusSetResponse> getResponseClass() {
        return PddGoodsSaleStatusSetResponse.class;
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
        if(isOnsale != null) {
            paramsMap.put("is_onsale", isOnsale.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setIsOnsale(Integer isOnsale) {
        this.isOnsale = isOnsale;
    }

    
    
}