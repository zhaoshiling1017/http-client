package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkThemeGoodsSearchResponse extends PopBaseHttpResponse{

    /**
     * 主题列表返回对象
     */
    @JsonProperty("theme_list_get_response")
    private ThemeListGetResponse themeListGetResponse;

    
    public ThemeListGetResponse getThemeListGetResponse() {
        return themeListGetResponse;
    }

    
    public static class GoodsListItem {

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
         * 商品详情图列表
         */
        @JsonProperty("goods_gallery_urls")
        private List<String> goodsGalleryUrls;

        /**
         * 已售卖件数
         */
        @JsonProperty("sold_quantity")
        private Long soldQuantity;

        /**
         * 最小拼团价格,单位为分
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 最小单买价格,单位为分
         */
        @JsonProperty("min_normal_price")
        private Long minNormalPrice;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 商品标签类目ID,使用pdd.goods.opt.get获取
         */
        @JsonProperty("opt_id")
        private Long optId;

        /**
         * 商品标签名
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * 商品一~四级类目ID列表
         */
        @JsonProperty("cat_ids")
        private List<Integer> catIds;

        /**
         * 商品是否带券,true-带券,false-不带券
         */
        @JsonProperty("has_coupon")
        private Boolean hasCoupon;

        /**
         * 优惠券门槛价格,单位为分
         */
        @JsonProperty("coupon_min_order_amount")
        private Long couponMinOrderAmount;

        /**
         * 优惠券面额,单位为分
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
         * 优惠券生效时间,UNIX时间戳
         */
        @JsonProperty("coupon_start_time")
        private Long couponStartTime;

        /**
         * 优惠券失效时间,UNIX时间戳
         */
        @JsonProperty("coupon_end_time")
        private Long couponEndTime;

        /**
         * 佣金比例,千分比
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 商品评价分
         */
        @JsonProperty("goods_eval_score")
        private Double goodsEvalScore;

        /**
         * 商品评价数量
         */
        @JsonProperty("goods_eval_count")
        private Long goodsEvalCount;

        
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

        public Long getOptId() {
            return optId;
        }

        public String getOptName() {
            return optName;
        }

        public List<Integer> getCatIds() {
            return catIds;
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

        
    }
    public static class ThemeListGetResponse {

        /**
         * 返回商品总数
         */
        @JsonProperty("total")
        private Long total;

        /**
         * 商品列表对象
         */
        @JsonProperty("goods_list")
        private List<GoodsListItem> goodsList;

        
        public Long getTotal() {
            return total;
        }

        public List<GoodsListItem> getGoodsList() {
            return goodsList;
        }

        
    }
    
}