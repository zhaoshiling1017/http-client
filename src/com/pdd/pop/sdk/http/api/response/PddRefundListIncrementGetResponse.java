package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddRefundListIncrementGetResponse extends PopBaseHttpResponse{

    /**
     * 售后增量订单列表对象
     */
    @JsonProperty("refund_increment_get_response")
    private RefundIncrementGetResponse refundIncrementGetResponse;

    
    public RefundIncrementGetResponse getRefundIncrementGetResponse() {
        return refundIncrementGetResponse;
    }

    
    public static class RefundIncrementGetResponse {

        /**
         * 返回的售后订单列表总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        /**
         * 售后列表对象
         */
        @JsonProperty("refund_list")
        private List<RefundListItem> refundList;

        
        public Integer getTotalCount() {
            return totalCount;
        }

        public List<RefundListItem> getRefundList() {
            return refundList;
        }

        
    }
    public static class RefundListItem {

        /**
         * 售后编号
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 成团时间
         */
        @JsonProperty("confirm_time")
        private String confirmTime;

        /**
         * 售后原因
         */
        @JsonProperty("after_sale_reason")
        private String afterSaleReason;

        /**
         * 售后状态
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 售后类型
         */
        @JsonProperty("after_sales_type")
        private Integer afterSalesType;

        /**
         * 订单金额（元）
         */
        @JsonProperty("order_amount")
        private String orderAmount;

        /**
         * 退款金额（元）
         */
        @JsonProperty("refund_amount")
        private String refundAmount;

        /**
         * 商品规格ID
         */
        @JsonProperty("sku_id")
        private String skuId;

        /**
         * 商家外部编码（sku）
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * 商家外部编码（商品）
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * 订单折扣金额（元）
         */
        @JsonProperty("discount_amount")
        private String discountAmount;

        /**
         * 商品单价
         */
        @JsonProperty("goods_price")
        private String goodsPrice;

        /**
         * 商品数量
         */
        @JsonProperty("goods_number")
        private String goodsNumber;

        /**
         * 商品编码
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品图片
         */
        @JsonProperty("good_image")
        private String goodImage;

        /**
         * 快递运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        /**
         * 创建时间
         */
        @JsonProperty("created_time")
        private String createdTime;

        /**
         * 更新时间
         */
        @JsonProperty("updated_time")
        private String updatedTime;

        
        public Long getId() {
            return id;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getConfirmTime() {
            return confirmTime;
        }

        public String getAfterSaleReason() {
            return afterSaleReason;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public Integer getAfterSalesType() {
            return afterSalesType;
        }

        public String getOrderAmount() {
            return orderAmount;
        }

        public String getRefundAmount() {
            return refundAmount;
        }

        public String getSkuId() {
            return skuId;
        }

        public String getOuterId() {
            return outerId;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getDiscountAmount() {
            return discountAmount;
        }

        public String getGoodsPrice() {
            return goodsPrice;
        }

        public String getGoodsNumber() {
            return goodsNumber;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getGoodImage() {
            return goodImage;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public String getUpdatedTime() {
            return updatedTime;
        }

        
    }
    
}