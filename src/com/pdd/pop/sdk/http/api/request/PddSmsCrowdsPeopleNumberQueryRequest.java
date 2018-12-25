package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsCrowdsPeopleNumberQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddSmsCrowdsPeopleNumberQueryRequest extends PopBaseHttpRequest<PddSmsCrowdsPeopleNumberQueryResponse>{

    /**
     * 人群id
     */
    @JsonProperty("crowd_id")
    private Long crowdId;

    /**
     * //0-全部 1-江浙沪 2-自定义
     */
    @JsonProperty("location_type")
    private Integer locationType;

    /**
     * [1,34] //  //选自定义的时候列表存省代表的id
     */
    @JsonProperty("location")
    private List<Long> location;

    /**
     * //0-全部 1-男 2-女
     */
    @JsonProperty("gender")
    private Integer gender;

    /**
     * 店铺有购买天数
     */
    @JsonProperty("purchase_days")
    private Long purchaseDays;

    /**
     * 店铺无购买天数
     */
    @JsonProperty("none_purchase_days")
    private Long nonePurchaseDays;

    /**
     * 收藏物品天数
     */
    @JsonProperty("goods_favor_days")
    private Long goodsFavorDays;

    /**
     * 收藏店铺天数
     */
    @JsonProperty("mall_favor_days")
    private Long mallFavorDays;

    /**
     * 历史订单成交次数
     */
    @JsonProperty("min_order_count")
    private Long minOrderCount;

    /**
     * 历史订单成交次数
     */
    @JsonProperty("max_order_count")
    private Long maxOrderCount;

    /**
     * 第一次购买时间
     */
    @JsonProperty("first_buy_start_time")
    private String firstBuyStartTime;

    /**
     * 最后一次购买时间
     */
    @JsonProperty("first_buy_end_time")
    private String firstBuyEndTime;

    /**
     * 店铺有访问天数
     */
    @JsonProperty("mall_visit_days")
    private Long mallVisitDays;

    
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
        return "pdd.sms.crowds.people.number.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsCrowdsPeopleNumberQueryResponse> getResponseClass() {
        return PddSmsCrowdsPeopleNumberQueryResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(crowdId != null) {
            paramsMap.put("crowd_id", crowdId.toString());
            
        }
        if(locationType != null) {
            paramsMap.put("location_type", locationType.toString());
            
        }
        if(location != null) {
            paramsMap.put("location", location.toString());
            
        }
        if(gender != null) {
            paramsMap.put("gender", gender.toString());
            
        }
        if(purchaseDays != null) {
            paramsMap.put("purchase_days", purchaseDays.toString());
            
        }
        if(nonePurchaseDays != null) {
            paramsMap.put("none_purchase_days", nonePurchaseDays.toString());
            
        }
        if(goodsFavorDays != null) {
            paramsMap.put("goods_favor_days", goodsFavorDays.toString());
            
        }
        if(mallFavorDays != null) {
            paramsMap.put("mall_favor_days", mallFavorDays.toString());
            
        }
        if(minOrderCount != null) {
            paramsMap.put("min_order_count", minOrderCount.toString());
            
        }
        if(maxOrderCount != null) {
            paramsMap.put("max_order_count", maxOrderCount.toString());
            
        }
        if(firstBuyStartTime != null) {
            paramsMap.put("first_buy_start_time", firstBuyStartTime.toString());
            
        }
        if(firstBuyEndTime != null) {
            paramsMap.put("first_buy_end_time", firstBuyEndTime.toString());
            
        }
        if(mallVisitDays != null) {
            paramsMap.put("mall_visit_days", mallVisitDays.toString());
            
        }
        
        return paramsMap;
    }

    public void setCrowdId(Long crowdId) {
        this.crowdId = crowdId;
    }

    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    public void setLocation(List<Long> location) {
        this.location = location;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setPurchaseDays(Long purchaseDays) {
        this.purchaseDays = purchaseDays;
    }

    public void setNonePurchaseDays(Long nonePurchaseDays) {
        this.nonePurchaseDays = nonePurchaseDays;
    }

    public void setGoodsFavorDays(Long goodsFavorDays) {
        this.goodsFavorDays = goodsFavorDays;
    }

    public void setMallFavorDays(Long mallFavorDays) {
        this.mallFavorDays = mallFavorDays;
    }

    public void setMinOrderCount(Long minOrderCount) {
        this.minOrderCount = minOrderCount;
    }

    public void setMaxOrderCount(Long maxOrderCount) {
        this.maxOrderCount = maxOrderCount;
    }

    public void setFirstBuyStartTime(String firstBuyStartTime) {
        this.firstBuyStartTime = firstBuyStartTime;
    }

    public void setFirstBuyEndTime(String firstBuyEndTime) {
        this.firstBuyEndTime = firstBuyEndTime;
    }

    public void setMallVisitDays(Long mallVisitDays) {
        this.mallVisitDays = mallVisitDays;
    }

    
    
}