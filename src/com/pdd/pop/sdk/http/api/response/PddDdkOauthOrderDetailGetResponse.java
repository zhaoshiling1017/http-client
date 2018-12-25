package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddDdkOauthOrderDetailGetResponse extends PopBaseHttpResponse{

    /**
     * order_detail_response
     */
    @JsonProperty("order_detail_response")
    private OrderDetailResponse orderDetailResponse;

    
    public OrderDetailResponse getOrderDetailResponse() {
        return orderDetailResponse;
    }

    
    public static class OrderDetailResponse {

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品缩略图
         */
        @JsonProperty("goods_thumbnail_url")
        private String goodsThumbnailUrl;

        /**
         * 商品数量
         */
        @JsonProperty("goods_quantity")
        private Long goodsQuantity;

        /**
         * 商品价格（分）
         */
        @JsonProperty("goods_price")
        private Long goodsPrice;

        /**
         * 订单价格（分）
         */
        @JsonProperty("order_amount")
        private Long orderAmount;

        /**
         * 佣金比例 千分比
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 佣金（分）
         */
        @JsonProperty("promotion_amount")
        private Long promotionAmount;

        /**
         * 结算批次号
         */
        @JsonProperty("batch_no")
        private String batchNo;

        /**
         * 订单状态
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 订单状态描述（ -1 未支付; 0-已支付；1-已成团；2-确认收货；3-审核成功；4-审核失败（不可提现）；5-已经结算；8-非多多进宝商品（无佣金订单）;10-已处罚）
         */
        @JsonProperty("order_status_desc")
        private String orderStatusDesc;

        /**
         * 订单创建时间（UNIX时间戳）
         */
        @JsonProperty("order_create_time")
        private Long orderCreateTime;

        /**
         * 订单支付时间（UNIX时间戳）
         */
        @JsonProperty("order_pay_time")
        private Long orderPayTime;

        /**
         * 订单成团时间（UNIX时间戳）
         */
        @JsonProperty("order_group_success_time")
        private Long orderGroupSuccessTime;

        /**
         * 订单确认收货时间（UNIX时间戳）
         */
        @JsonProperty("order_receive_time")
        private Long orderReceiveTime;

        /**
         * 订单审核时间（UNIX时间戳）
         */
        @JsonProperty("order_verify_time")
        private Long orderVerifyTime;

        /**
         * 订单结算时间（UNIX时间戳）
         */
        @JsonProperty("order_settle_time")
        private Long orderSettleTime;

        /**
         * 订单最后更新时间（UNIX时间戳）
         */
        @JsonProperty("order_modify_at")
        private Long orderModifyAt;

        /**
         * 订单来源 ：0 ：关联，5 ：直接下单页RPC请求
         */
        @JsonProperty("match_channel")
        private Integer matchChannel;

        /**
         * 订单类型：0：领券页面， 1： 红包页， 2：领券页， 3： 题页
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 成团编号
         */
        @JsonProperty("group_id")
        private Long groupId;

        /**
         * 多多客工具id
         */
        @JsonProperty("auth_duo_id")
        private Long authDuoId;

        /**
         * 招商多多客id
         */
        @JsonProperty("zs_duo_id")
        private Long zsDuoId;

        /**
         * 自定义参数
         */
        @JsonProperty("custom_parameters")
        private String customParameters;

        /**
         * CPS_Sign
         */
        @JsonProperty("cps_sign")
        private String cpsSign;

        /**
         * 链接最后一次生产时间
         */
        @JsonProperty("url_last_generate_time")
        private Long urlLastGenerateTime;

        /**
         * 打点时间
         */
        @JsonProperty("point_time")
        private Long pointTime;

        /**
         * 售后状态：0：无，1：售后中，2：售后完成
         */
        @JsonProperty("return_status")
        private Integer returnStatus;

        /**
         * 推广位id
         */
        @JsonProperty("pid")
        private String pid;

        
        public String getOrderSn() {
            return orderSn;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getGoodsThumbnailUrl() {
            return goodsThumbnailUrl;
        }

        public Long getGoodsQuantity() {
            return goodsQuantity;
        }

        public Long getGoodsPrice() {
            return goodsPrice;
        }

        public Long getOrderAmount() {
            return orderAmount;
        }

        public Long getPromotionRate() {
            return promotionRate;
        }

        public Long getPromotionAmount() {
            return promotionAmount;
        }

        public String getBatchNo() {
            return batchNo;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public String getOrderStatusDesc() {
            return orderStatusDesc;
        }

        public Long getOrderCreateTime() {
            return orderCreateTime;
        }

        public Long getOrderPayTime() {
            return orderPayTime;
        }

        public Long getOrderGroupSuccessTime() {
            return orderGroupSuccessTime;
        }

        public Long getOrderReceiveTime() {
            return orderReceiveTime;
        }

        public Long getOrderVerifyTime() {
            return orderVerifyTime;
        }

        public Long getOrderSettleTime() {
            return orderSettleTime;
        }

        public Long getOrderModifyAt() {
            return orderModifyAt;
        }

        public Integer getMatchChannel() {
            return matchChannel;
        }

        public Integer getType() {
            return type;
        }

        public Long getGroupId() {
            return groupId;
        }

        public Long getAuthDuoId() {
            return authDuoId;
        }

        public Long getZsDuoId() {
            return zsDuoId;
        }

        public String getCustomParameters() {
            return customParameters;
        }

        public String getCpsSign() {
            return cpsSign;
        }

        public Long getUrlLastGenerateTime() {
            return urlLastGenerateTime;
        }

        public Long getPointTime() {
            return pointTime;
        }

        public Integer getReturnStatus() {
            return returnStatus;
        }

        public String getPid() {
            return pid;
        }

        
    }
    
}