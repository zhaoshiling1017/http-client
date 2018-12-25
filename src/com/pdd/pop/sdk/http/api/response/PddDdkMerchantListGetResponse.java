package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkMerchantListGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("merchant_list_response")
    private MerchantListResponse merchantListResponse;

    
    public MerchantListResponse getMerchantListResponse() {
        return merchantListResponse;
    }

    
    public static class MerchantListResponse {

        /**
         * total
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 店铺券列表
         */
        @JsonProperty("mall_search_info_vo_list")
        private List<MallSearchInfoVoListItem> mallSearchInfoVoList;

        
        public Integer getTotal() {
            return total;
        }

        public List<MallSearchInfoVoListItem> getMallSearchInfoVoList() {
            return mallSearchInfoVoList;
        }

        
    }
    public static class MallSearchInfoVoListItem {

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 商品详情列表
         */
        @JsonProperty("goods_detail_vo_list")
        private List<GoodsDetailVoListItem> goodsDetailVoList;

        
        public Long getMallId() {
            return mallId;
        }

        public List<GoodsDetailVoListItem> getGoodsDetailVoList() {
            return goodsDetailVoList;
        }

        
    }
    public static class GoodsDetailVoListItem {

        /**
         * 创建时间
         */
        @JsonProperty("create_at")
        private Long createAt;

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
         * 商品描述
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品缩略图
         */
        @JsonProperty("goods_thumbnail_url")
        private String goodsThumbnailUrl;

        /**
         * 商品主图
         */
        @JsonProperty("goods_image_url")
        private String goodsImageUrl;

        /**
         * 商品详情图
         */
        @JsonProperty("goods_gallery_urls")
        private List<String> goodsGalleryUrls;

        /**
         * 商品售卖件数
         */
        @JsonProperty("sold_quantity")
        private Long soldQuantity;

        /**
         * 商品最小成团价（单位为分）
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 商品单买价（单位为分）
         */
        @JsonProperty("min_normal_price")
        private Long minNormalPrice;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 店铺类型，1-个人，2-企业，3-旗舰店，4-专卖店，5-专营店，6-普通店
         */
        @JsonProperty("merchant_type")
        private Integer merchantType;

        /**
         * 商品类目
         */
        @JsonProperty("category_id")
        private Long categoryId;

        /**
         * 商品类目名
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 商品标签
         */
        @JsonProperty("opt_id")
        private Long optId;

        /**
         * 商品标签名
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * 商品标签列表
         */
        @JsonProperty("opt_ids")
        private List<Integer> optIds;

        /**
         * 商品类目列表
         */
        @JsonProperty("cat_ids")
        private List<Integer> catIds;

        /**
         * 商品所在店铺是否开通全店推广 0：否，1：是
         */
        @JsonProperty("mall_cps")
        private Integer mallCps;

        /**
         * 商品是否有优惠券（指单品券）
         */
        @JsonProperty("has_coupon")
        private Boolean hasCoupon;

        /**
         * 使用优惠券的门槛金额（单位为分）
         */
        @JsonProperty("coupon_min_order_amount")
        private Long couponMinOrderAmount;

        /**
         * 优惠券面额（单位为分）
         */
        @JsonProperty("coupon_discount")
        private Long couponDiscount;

        /**
         * 优惠券总数量
         */
        @JsonProperty("coupon_total_quantity")
        private Long couponTotalQuantity;

        /**
         * 优惠券剩余数量
         */
        @JsonProperty("coupon_remain_quantity")
        private Long couponRemainQuantity;

        /**
         * 优惠券开始时间
         */
        @JsonProperty("coupon_start_time")
        private Long couponStartTime;

        /**
         * 优惠券结束时间
         */
        @JsonProperty("coupon_end_time")
        private Long couponEndTime;

        /**
         * 佣金比（单位为分）
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 商品评分
         */
        @JsonProperty("goods_eval_score")
        private Double goodsEvalScore;

        /**
         * 商品评价数
         */
        @JsonProperty("goods_eval_count")
        private Long goodsEvalCount;

        /**
         * 类目id
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 商品描述评分
         */
        @JsonProperty("avg_desc")
        private Long avgDesc;

        /**
         * 商品物流评分
         */
        @JsonProperty("avg_lgst")
        private Long avgLgst;

        /**
         * 商品服务评分
         */
        @JsonProperty("avg_serv")
        private Long avgServ;

        /**
         * 描述评分击败同类店铺百分比
         */
        @JsonProperty("desc_pct")
        private Double descPct;

        /**
         * 物流评分击败同类店铺百分比
         */
        @JsonProperty("lgst_pct")
        private Double lgstPct;

        /**
         * 服务评分击败同类店铺百分比
         */
        @JsonProperty("serv_pct")
        private Double servPct;

        
        public Long getCreateAt() {
            return createAt;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getGoodsDesc() {
            return goodsDesc;
        }

        public String getGoodsThumbnailUrl() {
            return goodsThumbnailUrl;
        }

        public String getGoodsImageUrl() {
            return goodsImageUrl;
        }

        public List<String> getGoodsGalleryUrls() {
            return goodsGalleryUrls;
        }

        public Long getSoldQuantity() {
            return soldQuantity;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public Long getMinNormalPrice() {
            return minNormalPrice;
        }

        public String getMallName() {
            return mallName;
        }

        public Integer getMerchantType() {
            return merchantType;
        }

        public Long getCategoryId() {
            return categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public Long getOptId() {
            return optId;
        }

        public String getOptName() {
            return optName;
        }

        public List<Integer> getOptIds() {
            return optIds;
        }

        public List<Integer> getCatIds() {
            return catIds;
        }

        public Integer getMallCps() {
            return mallCps;
        }

        public Boolean getHasCoupon() {
            return hasCoupon;
        }

        public Long getCouponMinOrderAmount() {
            return couponMinOrderAmount;
        }

        public Long getCouponDiscount() {
            return couponDiscount;
        }

        public Long getCouponTotalQuantity() {
            return couponTotalQuantity;
        }

        public Long getCouponRemainQuantity() {
            return couponRemainQuantity;
        }

        public Long getCouponStartTime() {
            return couponStartTime;
        }

        public Long getCouponEndTime() {
            return couponEndTime;
        }

        public Long getPromotionRate() {
            return promotionRate;
        }

        public Double getGoodsEvalScore() {
            return goodsEvalScore;
        }

        public Long getGoodsEvalCount() {
            return goodsEvalCount;
        }

        public Long getCatId() {
            return catId;
        }

        public Long getAvgDesc() {
            return avgDesc;
        }

        public Long getAvgLgst() {
            return avgLgst;
        }

        public Long getAvgServ() {
            return avgServ;
        }

        public Double getDescPct() {
            return descPct;
        }

        public Double getLgstPct() {
            return lgstPct;
        }

        public Double getServPct() {
            return servPct;
        }

        
    }
    
}