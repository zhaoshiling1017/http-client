package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddStockGoodsIdToSkuQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddStockGoodsIdToSkuQueryRequest extends PopBaseHttpRequest<PddStockGoodsIdToSkuQueryResponse>{

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 货品id
     */
    @JsonProperty("ware_id")
    private Long wareId;

    
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
        return "pdd.stock.goods.id.to.sku.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockGoodsIdToSkuQueryResponse> getResponseClass() {
        return PddStockGoodsIdToSkuQueryResponse.class;
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
        if(wareId != null) {
            paramsMap.put("ware_id", wareId.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    
    
}