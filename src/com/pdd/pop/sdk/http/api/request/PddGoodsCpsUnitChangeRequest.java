package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsCpsUnitChangeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddGoodsCpsUnitChangeRequest extends PopBaseHttpRequest<PddGoodsCpsUnitChangeResponse>{

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 佣金比例（千分比）
     */
    @JsonProperty("rate")
    private Long rate;

    /**
     * 优惠券id
     */
    @JsonProperty("coupon_id")
    private Long couponId;

    /**
     * 优惠券开始时间
     */
    @JsonProperty("coupon_start_time")
    private String couponStartTime;

    /**
     * 优惠券结束时间
     */
    @JsonProperty("coupon_end_time")
    private String couponEndTime;

    /**
     * 优惠券面额（单位为分）
     */
    @JsonProperty("discount")
    private Long discount;

    /**
     * 设置的优惠券张数
     */
    @JsonProperty("init_quantity")
    private Long initQuantity;

    /**
     * 优惠券剩余数量
     */
    @JsonProperty("remain_quantity")
    private Long remainQuantity;

    
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
        return "pdd.goods.cps.unit.change";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCpsUnitChangeResponse> getResponseClass() {
        return PddGoodsCpsUnitChangeResponse.class;
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
        if(rate != null) {
            paramsMap.put("rate", rate.toString());
            
        }
        if(couponId != null) {
            paramsMap.put("coupon_id", couponId.toString());
            
        }
        if(couponStartTime != null) {
            paramsMap.put("coupon_start_time", couponStartTime.toString());
            
        }
        if(couponEndTime != null) {
            paramsMap.put("coupon_end_time", couponEndTime.toString());
            
        }
        if(discount != null) {
            paramsMap.put("discount", discount.toString());
            
        }
        if(initQuantity != null) {
            paramsMap.put("init_quantity", initQuantity.toString());
            
        }
        if(remainQuantity != null) {
            paramsMap.put("remain_quantity", remainQuantity.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public void setCouponStartTime(String couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public void setCouponEndTime(String couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public void setInitQuantity(Long initQuantity) {
        this.initQuantity = initQuantity;
    }

    public void setRemainQuantity(Long remainQuantity) {
        this.remainQuantity = remainQuantity;
    }

    
    
}