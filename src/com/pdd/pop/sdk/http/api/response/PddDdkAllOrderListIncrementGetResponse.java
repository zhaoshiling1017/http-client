package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkAllOrderListIncrementGetResponse extends PopBaseHttpResponse{

    /**
     * order_list_get_response
     */
    @JsonProperty("order_list_get_response")
    private OrderListGetResponse orderListGetResponse;

    
    public OrderListGetResponse getOrderListGetResponse() {
        return orderListGetResponse;
    }

    
    public static class OrderListGetResponse {

        /**
         * 多多进宝推广位对象列表
         */
        @JsonProperty("order_list")
        private List<OrderListItem> orderList;

        /**
         * 请求到的结果数
         */
        @JsonProperty("total_count")
        private Long totalCount;

        
        public List<OrderListItem> getOrderList() {
            return orderList;
        }

        public Long getTotalCount() {
            return totalCount;
        }

        
    }
    public static class OrderListItem {

        /**
         * 审核时间
         */
        @JsonProperty("order_verify_time")
        private Long orderVerifyTime;

        /**
         * 支付时间
         */
        @JsonProperty("order_pay_time")
        private Long orderPayTime;

        /**
         * 成团时间
         */
        @JsonProperty("order_group_success_time")
        private Long orderGroupSuccessTime;

        /**
         * 最后更新时间
         */
        @JsonProperty("order_modify_at")
        private Long orderModifyAt;

        /**
         * 订单状态描述
         */
        @JsonProperty("order_status_desc")
        private String orderStatusDesc;

        /**
         * 推广位ID
         */
        @JsonProperty("p_id")
        private String pId;

        /**
         * 订单状态：  -1 未支付; 0-已支付；1-已成团；2-确认收货；3-审核成功；4-审核失败（不可提现）；5-已经结算；8-非多多进宝商品（无佣金订单）
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 佣金金额，单位为分
         */
        @JsonProperty("promotion_amount")
        private Long promotionAmount;

        /**
         * 佣金比例，千分比
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 订单生成时间，UNIX时间戳
         */
        @JsonProperty("order_create_time")
        private Long orderCreateTime;

        /**
         * 实际支付金额，单位为分
         */
        @JsonProperty("order_amount")
        private Long orderAmount;

        /**
         * 订单中sku的单件价格，单位为分
         */
        @JsonProperty("goods_price")
        private Long goodsPrice;

        /**
         * 购买商品的数量
         */
        @JsonProperty("goods_quantity")
        private Long goodsQuantity;

        /**
         * 商品缩略图
         */
        @JsonProperty("goods_thumbnail_url")
        private String goodsThumbnailUrl;

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 推广订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        
        public Long getOrderVerifyTime() {
            return orderVerifyTime;
        }

        public Long getOrderPayTime() {
            return orderPayTime;
        }

        public Long getOrderGroupSuccessTime() {
            return orderGroupSuccessTime;
        }

        public Long getOrderModifyAt() {
            return orderModifyAt;
        }

        public String getOrderStatusDesc() {
            return orderStatusDesc;
        }

        public String getPId() {
            return pId;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public Long getPromotionAmount() {
            return promotionAmount;
        }

        public Long getPromotionRate() {
            return promotionRate;
        }

        public Long getOrderCreateTime() {
            return orderCreateTime;
        }

        public Long getOrderAmount() {
            return orderAmount;
        }

        public Long getGoodsPrice() {
            return goodsPrice;
        }

        public Long getGoodsQuantity() {
            return goodsQuantity;
        }

        public String getGoodsThumbnailUrl() {
            return goodsThumbnailUrl;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getOrderSn() {
            return orderSn;
        }

        
    }
    
}