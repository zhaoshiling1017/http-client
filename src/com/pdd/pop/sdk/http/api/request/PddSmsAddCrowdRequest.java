package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddSmsAddCrowdResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddSmsAddCrowdRequest extends PopBaseHttpRequest<PddSmsAddCrowdResponse>{

    /**
     * 选自定义的时候列表存省代表的id [10]
     */
    @JsonProperty("location")
    private List<Long> location;

    /**
     * 地区类型 0-不限 1-江浙沪 2-自定义
     */
    @JsonProperty("location_type")
    private Integer locationType;

    /**
     * 性别 0-全部 1-男 2-女
     */
    @JsonProperty("gender")
    private Integer gender;

    /**
     * 商品收藏天数
     */
    @JsonProperty("goods_favor_days")
    private Long goodsFavorDays;

    /**
     * 店铺收藏天数
     */
    @JsonProperty("mall_favor_days")
    private Long mallFavorDays;

    /**
     * 人群名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 店铺无购买天数
     */
    @JsonProperty("none_purchase_days")
    private Long nonePurchaseDays;

    /**
     * 店铺有购买天数
     */
    @JsonProperty("purchase_days")
    private Long purchaseDays;

    /**
     * 历史成交最小次数
     */
    @JsonProperty("min_order_count")
    private Long minOrderCount;

    /**
     * 历史成交最大次数
     */
    @JsonProperty("max_order_count")
    private Long maxOrderCount;

    /**
     * 首次购买开始时间 "2017-10-19 00:00:00"
     */
    @JsonProperty("first_buy_start_time")
    private String firstBuyStartTime;

    /**
     * 首次购买结束时间
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
        return "pdd.sms.add.crowd";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsAddCrowdResponse> getResponseClass() {
        return PddSmsAddCrowdResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(location != null) {
            paramsMap.put("location", location.toString());
            
        }
        if(locationType != null) {
            paramsMap.put("location_type", locationType.toString());
            
        }
        if(gender != null) {
            paramsMap.put("gender", gender.toString());
            
        }
        if(goodsFavorDays != null) {
            paramsMap.put("goods_favor_days", goodsFavorDays.toString());
            
        }
        if(mallFavorDays != null) {
            paramsMap.put("mall_favor_days", mallFavorDays.toString());
            
        }
        if(name != null) {
            paramsMap.put("name", name.toString());
            
        }
        if(nonePurchaseDays != null) {
            paramsMap.put("none_purchase_days", nonePurchaseDays.toString());
            
        }
        if(purchaseDays != null) {
            paramsMap.put("purchase_days", purchaseDays.toString());
            
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

    public void setLocation(List<Long> location) {
        this.location = location;
    }

    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setGoodsFavorDays(Long goodsFavorDays) {
        this.goodsFavorDays = goodsFavorDays;
    }

    public void setMallFavorDays(Long mallFavorDays) {
        this.mallFavorDays = mallFavorDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNonePurchaseDays(Long nonePurchaseDays) {
        this.nonePurchaseDays = nonePurchaseDays;
    }

    public void setPurchaseDays(Long purchaseDays) {
        this.purchaseDays = purchaseDays;
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