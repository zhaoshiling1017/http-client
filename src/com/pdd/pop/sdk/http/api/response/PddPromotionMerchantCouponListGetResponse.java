package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPromotionMerchantCouponListGetResponse extends PopBaseHttpResponse{

    /**
     * 返回店铺优惠券批次列表
     */
    @JsonProperty("merchant_coupon_batch_list_response")
    private MerchantCouponBatchListResponse merchantCouponBatchListResponse;

    
    public MerchantCouponBatchListResponse getMerchantCouponBatchListResponse() {
        return merchantCouponBatchListResponse;
    }

    
    public static class MerchantCouponBatchListResponse {

        /**
         * 返回店铺优惠券批次数量
         */
        @JsonProperty("total_size")
        private Integer totalSize;

        /**
         * 返回店铺优惠券批次对象
         */
        @JsonProperty("coupon_batch_list")
        private List<CouponBatchListItem> couponBatchList;

        
        public Integer getTotalSize() {
            return totalSize;
        }

        public List<CouponBatchListItem> getCouponBatchList() {
            return couponBatchList;
        }

        
    }
    public static class CouponBatchListItem {

        /**
         * 批次ID
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 批次名
         */
        @JsonProperty("batch_name")
        private String batchName;

        /**
         * 批次描述
         */
        @JsonProperty("batch_desc")
        private String batchDesc;

        /**
         * 折扣类型，1 代表满减券，2 代表折扣券
         */
        @JsonProperty("discount_type")
        private Integer discountType;

        /**
         * 折扣参数，为请求中传入的discount_amount，表示折扣金额，单位: 分
         */
        @JsonProperty("discount_param")
        private Long discountParam;

        /**
         * 初始数量
         */
        @JsonProperty("init_quantity")
        private Long initQuantity;

        /**
         * 剩余数量
         */
        @JsonProperty("remain_quantity")
        private Long remainQuantity;

        /**
         * 已使用数量
         */
        @JsonProperty("used_quantity")
        private Long usedQuantity;

        /**
         * 用户限领张数，-1 代表不限制
         */
        @JsonProperty("user_limit")
        private Long userLimit;

        /**
         * 最大折扣金额
         */
        @JsonProperty("max_discount_amount")
        private Long maxDiscountAmount;

        /**
         * 券有效时长
         */
        @JsonProperty("duration")
        private Long duration;

        /**
         * 券有效期时长的单位，0 代表天，2 代表小时
         */
        @JsonProperty("period_type")
        private Integer periodType;

        /**
         * 批次开始时间
         */
        @JsonProperty("batch_start_time")
        private Long batchStartTime;

        /**
         * 批次结束时间
         */
        @JsonProperty("batch_end_time")
        private Long batchEndTime;

        /**
         * 券来源类型，16 店铺直接领券，41 店铺精选评价优惠券，66 商家短信营销优惠券
         */
        @JsonProperty("source_type")
        private Integer sourceType;

        /**
         * 券类型，固定为8，代表商家券
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 批次状态，1 领取中，2 已领完，3 已结束
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 用券条件
         */
        @JsonProperty("rules")
        private String rules;

        /**
         * 券展示类型，固定为8，代表商家券
         */
        @JsonProperty("display_type")
        private Integer displayType;

        /**
         * 批次创建时间
         */
        @JsonProperty("created_at")
        private Long createdAt;

        
        public Long getId() {
            return id;
        }

        public String getBatchName() {
            return batchName;
        }

        public String getBatchDesc() {
            return batchDesc;
        }

        public Integer getDiscountType() {
            return discountType;
        }

        public Long getDiscountParam() {
            return discountParam;
        }

        public Long getInitQuantity() {
            return initQuantity;
        }

        public Long getRemainQuantity() {
            return remainQuantity;
        }

        public Long getUsedQuantity() {
            return usedQuantity;
        }

        public Long getUserLimit() {
            return userLimit;
        }

        public Long getMaxDiscountAmount() {
            return maxDiscountAmount;
        }

        public Long getDuration() {
            return duration;
        }

        public Integer getPeriodType() {
            return periodType;
        }

        public Long getBatchStartTime() {
            return batchStartTime;
        }

        public Long getBatchEndTime() {
            return batchEndTime;
        }

        public Integer getSourceType() {
            return sourceType;
        }

        public Integer getType() {
            return type;
        }

        public Integer getStatus() {
            return status;
        }

        public String getRules() {
            return rules;
        }

        public Integer getDisplayType() {
            return displayType;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        
    }
    
}