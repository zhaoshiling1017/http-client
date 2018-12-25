package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsQuantityUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsQuantityUpdateRequest extends PopBaseHttpRequest<PddGoodsQuantityUpdateResponse>{

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 库存修改值。当全量更新库存时，quantity必须为大于等于0的正整数；当增量更新库存时，quantity为整数，可小于等于0。若增量更新时传入的库存为负数，则负数与实际库存之和不能小于0。比如当前实际库存为1，传入增量更新quantity=-1，库存改为0
     */
    @JsonProperty("quantity")
    private Long quantity;

    /**
     * sku_id和outer_id必填一个
     */
    @JsonProperty("sku_id")
    private Long skuId;

    /**
     * sku商家编码
     */
    @JsonProperty("outer_id")
    private String outerId;

    /**
     * 库存更新方式，可选。1为全量更新，2为增量更新。如果不填，默认为全量更新
     */
    @JsonProperty("update_type")
    private Integer updateType;

    
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
        return "pdd.goods.quantity.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsQuantityUpdateResponse> getResponseClass() {
        return PddGoodsQuantityUpdateResponse.class;
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
        if(quantity != null) {
            paramsMap.put("quantity", quantity.toString());
            
        }
        if(skuId != null) {
            paramsMap.put("sku_id", skuId.toString());
            
        }
        if(outerId != null) {
            paramsMap.put("outer_id", outerId.toString());
            
        }
        if(updateType != null) {
            paramsMap.put("update_type", updateType.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    
    
}