package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddSmsCrowdsQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_crows_query_response")
    private SmsCrowsQueryResponse smsCrowsQueryResponse;

    
    public SmsCrowsQueryResponse getSmsCrowsQueryResponse() {
        return smsCrowsQueryResponse;
    }

    
    public static class SmsCrowsQueryResponse {

        /**
         * 数量
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 结果
         */
        @JsonProperty("result")
        private List<ResultItem> result;

        
        public Integer getTotal() {
            return total;
        }

        public List<ResultItem> getResult() {
            return result;
        }

        
    }
    public static class Crowd {

        /**
         * 对象类型
         */
        @JsonProperty("location_type")
        private Integer locationType;

        /**
         * 对象
         */
        @JsonProperty("location")
        private String location;

        /**
         * 性别
         */
        @JsonProperty("gender")
        private Integer gender;

        /**
         * 有购买天数
         */
        @JsonProperty("purchase_days")
        private Long purchaseDays;

        /**
         * 无购买天数
         */
        @JsonProperty("none_purchase_days")
        private Long nonePurchaseDays;

        /**
         * 商品被收藏天数
         */
        @JsonProperty("goods_favor_days")
        private Long goodsFavorDays;

        /**
         * 店铺被收藏天数
         */
        @JsonProperty("mall_favor_days")
        private Long mallFavorDays;

        /**
         * 最小订单金额
         */
        @JsonProperty("min_order_count")
        private Long minOrderCount;

        /**
         * 最大订单金额
         */
        @JsonProperty("max_order_count")
        private Long maxOrderCount;

        /**
         * 首次购买开始时间
         */
        @JsonProperty("first_buy_start_time")
        private Long firstBuyStartTime;

        /**
         * 首次购买结束时间
         */
        @JsonProperty("first_buy_end_time")
        private Long firstBuyEndTime;

        /**
         * 店铺有浏览天数
         */
        @JsonProperty("mall_visit_days")
        private Long mallVisitDays;

        /**
         * 店铺无浏览天数
         */
        @JsonProperty("mall_none_visit_days")
        private Long mallNoneVisitDays;

        
        public Integer getLocationType() {
            return locationType;
        }

        public String getLocation() {
            return location;
        }

        public Integer getGender() {
            return gender;
        }

        public Long getPurchaseDays() {
            return purchaseDays;
        }

        public Long getNonePurchaseDays() {
            return nonePurchaseDays;
        }

        public Long getGoodsFavorDays() {
            return goodsFavorDays;
        }

        public Long getMallFavorDays() {
            return mallFavorDays;
        }

        public Long getMinOrderCount() {
            return minOrderCount;
        }

        public Long getMaxOrderCount() {
            return maxOrderCount;
        }

        public Long getFirstBuyStartTime() {
            return firstBuyStartTime;
        }

        public Long getFirstBuyEndTime() {
            return firstBuyEndTime;
        }

        public Long getMallVisitDays() {
            return mallVisitDays;
        }

        public Long getMallNoneVisitDays() {
            return mallNoneVisitDays;
        }

        
    }
    public static class ResultItem {

        /**
         * 人群id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 类型
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 场景
         */
        @JsonProperty("scene")
        private Integer scene;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 人群数量
         */
        @JsonProperty("people_num")
        private Long peopleNum;

        /**
         * 人群
         */
        @JsonProperty("crowd")
        private Crowd crowd;

        
        public Long getId() {
            return id;
        }

        public Integer getType() {
            return type;
        }

        public Integer getScene() {
            return scene;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getName() {
            return name;
        }

        public Long getPeopleNum() {
            return peopleNum;
        }

        public Crowd getCrowd() {
            return crowd;
        }

        
    }
    
}