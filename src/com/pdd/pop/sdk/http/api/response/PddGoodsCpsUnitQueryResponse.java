package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsCpsUnitQueryResponse extends PopBaseHttpResponse{

    /**
     * 单品推广计划单元id
     */
    @JsonProperty("unit_id")
    private Long unitId;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 佣金比例（千分比）
     */
    @JsonProperty("rate")
    private Integer rate;

    /**
     * 修改后第二天生效的佣金费率（千分比）
     */
    @JsonProperty("rate_to_be")
    private Integer rateToBe;

    /**
     * 商品状态，1-推广中，2-暂停，3-删除
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * 修改后第二天生效的状态，1-推广中，2-暂停，3-删除
     */
    @JsonProperty("status_to_be")
    private Integer statusToBe;

    /**
     * 计划使用的优惠券信息。商品没有优惠券将返回null，有优惠券将返回优惠券信息，包括优惠券起始结束时间，优惠券数量，剩余数量，金额等
     */
    @JsonProperty("coupon_vo")
    private CouponVo couponVo;

    
    public Long getUnitId() {
        return unitId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public Integer getRate() {
        return rate;
    }

    public Integer getRateToBe() {
        return rateToBe;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getStatusToBe() {
        return statusToBe;
    }

    public CouponVo getCouponVo() {
        return couponVo;
    }

    
    public static class CouponVo {

        /**
         * coupon_id
         */
        @JsonProperty("coupon_id")
        private Long couponId;

        /**
         * coupon_start_time
         */
        @JsonProperty("coupon_start_time")
        private String couponStartTime;

        /**
         * coupon_end_time
         */
        @JsonProperty("coupon_end_time")
        private String couponEndTime;

        /**
         * discount
         */
        @JsonProperty("discount")
        private Integer discount;

        /**
         * init_quantity
         */
        @JsonProperty("init_quantity")
        private Long initQuantity;

        /**
         * remain_quantity
         */
        @JsonProperty("remain_quantity")
        private Long remainQuantity;

        
        public Long getCouponId() {
            return couponId;
        }

        public String getCouponStartTime() {
            return couponStartTime;
        }

        public String getCouponEndTime() {
            return couponEndTime;
        }

        public Integer getDiscount() {
            return discount;
        }

        public Long getInitQuantity() {
            return initQuantity;
        }

        public Long getRemainQuantity() {
            return remainQuantity;
        }

        
    }
    
}