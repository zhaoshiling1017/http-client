package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsSearchResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_search_response")
    private GoodsSearchResponse goodsSearchResponse;

    
    public GoodsSearchResponse getGoodsSearchResponse() {
        return goodsSearchResponse;
    }

    
    public static class GoodsSearchResponse {

        /**
         * 商品列表
         */
        @JsonProperty("goods_list")
        private List<GoodsListItem> goodsList;

        /**
         * 返回商品总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        
        public List<GoodsListItem> getGoodsList() {
            return goodsList;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        
    }
    public static class GoodsListItem {

        /**
         * 创建时间（unix时间戳）
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
         * 商品轮播图
         */
        @JsonProperty("goods_gallery_urls")
        private List<String> goodsGalleryUrls;

        /**
         * 已售卖件数
         */
        @JsonProperty("sold_quantity")
        private Long soldQuantity;

        /**
         * 最小拼团价（单位为分）
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 最小单买价格（单位为分）
         */
        @JsonProperty("min_normal_price")
        private Long minNormalPrice;

        /**
         * 店铺名字
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 店铺类型，1-个人，2-企业，3-旗舰店，4-专卖店，5-专营店，6-普通店
         */
        @JsonProperty("merchant_type")
        private Integer merchantType;

        /**
         * 商品类目ID，使用pdd.goods.cats.get接口获取
         */
        @JsonProperty("category_id")
        private Long categoryId;

        /**
         * 商品类目名
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 商品标签ID，使用pdd.goods.opts.get接口获取
         */
        @JsonProperty("opt_id")
        private Long optId;

        /**
         * 商品标签名
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * 商品标签id
         */
        @JsonProperty("opt_ids")
        private List<Long> optIds;

        /**
         * 商品类目id
         */
        @JsonProperty("cat_ids")
        private List<Long> catIds;

        /**
         * 该商品所在店铺是否参与全店推广，0：否，1：是
         */
        @JsonProperty("mall_cps")
        private Integer mallCps;

        /**
         * 商品是否有优惠券 true-有，false-没有
         */
        @JsonProperty("has_coupon")
        private Boolean hasCoupon;

        /**
         * 优惠券门槛价格，单位为分
         */
        @JsonProperty("coupon_min_order_amount")
        private Long couponMinOrderAmount;

        /**
         * 优惠券面额，单位为分
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
         * 优惠券生效时间，UNIX时间戳
         */
        @JsonProperty("coupon_start_time")
        private Long couponStartTime;

        /**
         * 优惠券失效时间，UNIX时间戳
         */
        @JsonProperty("coupon_end_time")
        private Long couponEndTime;

        /**
         * 佣金比例，千分比
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

        /**
         * 描述评分
         */
        @JsonProperty("avg_desc")
        private Long avgDesc;

        /**
         * 物流评分
         */
        @JsonProperty("avg_lgst")
        private Long avgLgst;

        /**
         * 服务评分
         */
        @JsonProperty("avg_serv")
        private Long avgServ;

        /**
         * 描述分击败同类店铺百分比
         */
        @JsonProperty("desc_pct")
        private Double descPct;

        /**
         * 物流分击败同类店铺百分比
         */
        @JsonProperty("lgst_pct")
        private Double lgstPct;

        /**
         * 服务分击败同类店铺百分比
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

        public List<Long> getOptIds() {
            return optIds;
        }

        public List<Long> getCatIds() {
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