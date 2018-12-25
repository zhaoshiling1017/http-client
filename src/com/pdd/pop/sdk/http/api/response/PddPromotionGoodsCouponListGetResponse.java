package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPromotionGoodsCouponListGetResponse extends PopBaseHttpResponse{

    /**
     * 返回商品优惠券批次表
     */
    @JsonProperty("goods_coupon_batch_list_response")
    private GoodsCouponBatchListResponse goodsCouponBatchListResponse;

    
    public GoodsCouponBatchListResponse getGoodsCouponBatchListResponse() {
        return goodsCouponBatchListResponse;
    }

    
    public static class GoodsCouponBatchListResponse {

        /**
         * 返回商品优惠券对象
         */
        @JsonProperty("coupon_batch_list")
        private List<CouponBatchListItem> couponBatchList;

        /**
         * 返回的优惠券总数
         */
        @JsonProperty("total_size")
        private Integer totalSize;

        
        public List<CouponBatchListItem> getCouponBatchList() {
            return couponBatchList;
        }

        public Integer getTotalSize() {
            return totalSize;
        }

        
    }
    public static class CouponBatchListItem {

        /**
         * 批次ID
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 批次描述
         */
        @JsonProperty("batch_desc")
        private String batchDesc;

        /**
         * 折扣参数，为请求中传入的discountAmount，表示折扣金额，单位: 分
         */
        @JsonProperty("discount_param")
        private Long discountParam;

        /**
         * 最小可用订单金额
         */
        @JsonProperty("min_order_amount")
        private Long minOrderAmount;

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
         * 券来源类型，45 店铺多多进宝商品券，54 无门槛商品券，87 店铺多多进宝大淘客定向商品券，88 店铺多多果园商品券
         */
        @JsonProperty("source_type")
        private Integer sourceType;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 图片URL
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 批次状态，1 领取中，2 已领完，3 已结束，4 已暂停
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 批次创建时间
         */
        @JsonProperty("created_at")
        private Long createdAt;

        
        public Long getId() {
            return id;
        }

        public String getBatchDesc() {
            return batchDesc;
        }

        public Long getDiscountParam() {
            return discountParam;
        }

        public Long getMinOrderAmount() {
            return minOrderAmount;
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

        public Long getBatchStartTime() {
            return batchStartTime;
        }

        public Long getBatchEndTime() {
            return batchEndTime;
        }

        public Integer getSourceType() {
            return sourceType;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public Integer getStatus() {
            return status;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        
    }
    
}