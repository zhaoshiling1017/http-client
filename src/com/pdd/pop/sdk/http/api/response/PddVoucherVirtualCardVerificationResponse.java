package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddVoucherVirtualCardVerificationResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("voucher_voucher_info_verify_response")
    private VoucherVoucherInfoVerifyResponse voucherVoucherInfoVerifyResponse;

    
    public VoucherVoucherInfoVerifyResponse getVoucherVoucherInfoVerifyResponse() {
        return voucherVoucherInfoVerifyResponse;
    }

    
    public static class VoucherListItem {

        /**
         * 卡号
         */
        @JsonProperty("card_no")
        private String cardNo;

        /**
         * 卡密
         */
        @JsonProperty("card_code")
        private String cardCode;

        /**
         * 标准密码
         */
        @JsonProperty("mark_password")
        private String markPassword;

        /**
         * 状态
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 返回状态
         */
        @JsonProperty("refund_status")
        private Integer refundStatus;

        /**
         * 验证处
         */
        @JsonProperty("verification_at")
        private Long verificationAt;

        
        public String getCardNo() {
            return cardNo;
        }

        public String getCardCode() {
            return cardCode;
        }

        public String getMarkPassword() {
            return markPassword;
        }

        public Integer getStatus() {
            return status;
        }

        public Integer getRefundStatus() {
            return refundStatus;
        }

        public Long getVerificationAt() {
            return verificationAt;
        }

        
    }
    public static class VoucherVoucherInfoVerifyResponse {

        /**
         * 拼多多订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品属性id
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 券信息数组
         */
        @JsonProperty("voucher_list")
        private List<VoucherListItem> voucherList;

        
        public String getOrderSn() {
            return orderSn;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Long getMallId() {
            return mallId;
        }

        public List<VoucherListItem> getVoucherList() {
            return voucherList;
        }

        
    }
    
}