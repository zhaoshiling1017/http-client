package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddSmsSellSettingDetailQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_sell_setting_detail_query_response")
    private SmsSellSettingDetailQueryResponse smsSellSettingDetailQueryResponse;

    
    public SmsSellSettingDetailQueryResponse getSmsSellSettingDetailQueryResponse() {
        return smsSellSettingDetailQueryResponse;
    }

    
    public static class Crowd {

        /**
         * 人群名称
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
        private Crowd1 crowd;

        
        public String getName() {
            return name;
        }

        public Long getPeopleNum() {
            return peopleNum;
        }

        public Crowd1 getCrowd() {
            return crowd;
        }

        
    }
    public static class SmsSellSettingDetailQueryResponse {

        /**
         * 模板id
         */
        @JsonProperty("template_id")
        private Integer templateId;

        /**
         * 模版内容
         */
        @JsonProperty("template_content")
        private String templateContent;

        /**
         * 发送时间
         */
        @JsonProperty("send_time")
        private String sendTime;

        /**
         * 是否开启 1-开启 0-关闭
         */
        @JsonProperty("open")
        private Integer open;

        /**
         * 实际发送记录
         */
        @JsonProperty("send_num")
        private Integer sendNum;

        /**
         * 人群id
         */
        @JsonProperty("crowd_id")
        private Long crowdId;

        /**
         * 人群
         */
        @JsonProperty("crowd")
        private Crowd crowd;

        /**
         * 任务id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 设置类型
         */
        @JsonProperty("scene")
        private Integer scene;

        /**
         * 触发状态
         */
        @JsonProperty("trigger_condition")
        private Integer triggerCondition;

        /**
         * 目标
         */
        @JsonProperty("target")
        private Target target;

        
        public Integer getTemplateId() {
            return templateId;
        }

        public String getTemplateContent() {
            return templateContent;
        }

        public String getSendTime() {
            return sendTime;
        }

        public Integer getOpen() {
            return open;
        }

        public Integer getSendNum() {
            return sendNum;
        }

        public Long getCrowdId() {
            return crowdId;
        }

        public Crowd getCrowd() {
            return crowd;
        }

        public Long getId() {
            return id;
        }

        public Long getMallId() {
            return mallId;
        }

        public Integer getScene() {
            return scene;
        }

        public Integer getTriggerCondition() {
            return triggerCondition;
        }

        public Target getTarget() {
            return target;
        }

        
    }
    public static class Target {

        /**
         * 实付金额最低价
         */
        @JsonProperty("min_pay_amount")
        private Long minPayAmount;

        /**
         * 实付金额最高价
         */
        @JsonProperty("max_pay_amount")
        private Long maxPayAmount;

        /**
         * 是否不限
         */
        @JsonProperty("pay_amount_limit")
        private Integer payAmountLimit;

        /**
         * 性别
         */
        @JsonProperty("sex")
        private Integer sex;

        /**
         * 收获地区
         */
        @JsonProperty("region")
        private List<Integer> region;

        /**
         * 地区类型
         */
        @JsonProperty("region_type")
        private Integer regionType;

        /**
         * 订单开始时间
         */
        @JsonProperty("order_start_time")
        private String orderStartTime;

        /**
         * 订单结束时间
         */
        @JsonProperty("order_end_time")
        private String orderEndTime;

        /**
         * 订单时间类型
         */
        @JsonProperty("order_time_type")
        private Integer orderTimeType;

        /**
         * 预计发送人数
         */
        @JsonProperty("people_num")
        private Integer peopleNum;

        
        public Long getMinPayAmount() {
            return minPayAmount;
        }

        public Long getMaxPayAmount() {
            return maxPayAmount;
        }

        public Integer getPayAmountLimit() {
            return payAmountLimit;
        }

        public Integer getSex() {
            return sex;
        }

        public List<Integer> getRegion() {
            return region;
        }

        public Integer getRegionType() {
            return regionType;
        }

        public String getOrderStartTime() {
            return orderStartTime;
        }

        public String getOrderEndTime() {
            return orderEndTime;
        }

        public Integer getOrderTimeType() {
            return orderTimeType;
        }

        public Integer getPeopleNum() {
            return peopleNum;
        }

        
    }
    public static class Crowd1 {

        /**
         * 定位类型
         */
        @JsonProperty("location_type")
        private Integer locationType;

        /**
         * 选自定义的时候列表存省代表的id
         */
        @JsonProperty("location")
        private List<Long> location;

        /**
         * 性别
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
         * 历史订单最小成交次数
         */
        @JsonProperty("min_order_count")
        private Long minOrderCount;

        /**
         * 历史订单最大成交次数
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
         * 店铺有访问天数
         */
        @JsonProperty("mall_visit_days")
        private Long mallVisitDays;

        /**
         * 店铺无访问天数
         */
        @JsonProperty("mall_none_visit_days")
        private Long mallNoneVisitDays;

        
        public Integer getLocationType() {
            return locationType;
        }

        public List<Long> getLocation() {
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
    
}