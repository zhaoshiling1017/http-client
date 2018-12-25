package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddPromotionCouponQuantityAddResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddPromotionCouponQuantityAddRequest extends PopBaseHttpRequest<PddPromotionCouponQuantityAddResponse>{

    /**
     * 券批次ID
     */
    @JsonProperty("batch_id")
    private Long batchId;

    /**
     * 要增加的数量
     */
    @JsonProperty("add_quantity")
    private Long addQuantity;

    
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
        return "pdd.promotion.coupon.quantity.add";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionCouponQuantityAddResponse> getResponseClass() {
        return PddPromotionCouponQuantityAddResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(batchId != null) {
            paramsMap.put("batch_id", batchId.toString());
            
        }
        if(addQuantity != null) {
            paramsMap.put("add_quantity", addQuantity.toString());
            
        }
        
        return paramsMap;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public void setAddQuantity(Long addQuantity) {
        this.addQuantity = addQuantity;
    }

    
    
}