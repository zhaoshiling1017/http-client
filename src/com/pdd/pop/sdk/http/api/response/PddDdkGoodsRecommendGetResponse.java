package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsRecommendGetResponse extends PopBaseHttpResponse{

    /**
     * goods_basic_detail_response
     */
    @JsonProperty("goods_basic_detail_response")
    private GoodsBasicDetailResponse goodsBasicDetailResponse;

    
    public GoodsBasicDetailResponse getGoodsBasicDetailResponse() {
        return goodsBasicDetailResponse;
    }

    
    public static class GoodsBasicDetailResponse {

        /**
         * total
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 列表
         */
        @JsonProperty("list")
        private List<ListItem> list;

        
        public Integer getTotal() {
            return total;
        }

        public List<ListItem> getList() {
            return list;
        }

        
    }
    public static class ListItem {

        /**
         * 二维码主图
         */
        @JsonProperty("qr_code_image_url")
        private String qrCodeImageUrl;

        /**
         * 编辑锁定
         */
        @JsonProperty("lock_edit")
        private String lockEdit;

        /**
         * 代理人
         */
        @JsonProperty("broker")
        private String broker;

        /**
         * 顺序
         */
        @JsonProperty("rank")
        private String rank;

        /**
         * 今日成交量
         */
        @JsonProperty("sale_num_today")
        private Long saleNumToday;

        /**
         * 成交量
         */
        @JsonProperty("sale_num24")
        private Long saleNum24;

        /**
         * 服务评分击败同类店铺百分比
         */
        @JsonProperty("serv_pct")
        private Double servPct;

        /**
         * 物流评分击败同类店铺百分比
         */
        @JsonProperty("lgst_pct")
        private Double lgstPct;

        /**
         * 描述评分击败同类店铺百分比
         */
        @JsonProperty("desc_pct")
        private Double descPct;

        /**
         * 服务评分
         */
        @JsonProperty("avg_serv")
        private Long avgServ;

        /**
         * 物流评分
         */
        @JsonProperty("avg_lgst")
        private Long avgLgst;

        /**
         * 描述评分
         */
        @JsonProperty("avg_desc")
        private Long avgDesc;

        /**
         * 分享描述
         */
        @JsonProperty("share_desc")
        private String shareDesc;

        /**
         * 商品类目id
         */
        @JsonProperty("cat_id")
        private String catId;

        /**
         * 商品评价数量
         */
        @JsonProperty("goods_eval_count")
        private Long goodsEvalCount;

        /**
         * 商品评价分
         */
        @JsonProperty("goods_eval_score")
        private Double goodsEvalScore;

        /**
         * 市场服务费
         */
        @JsonProperty("market_fee")
        private Long marketFee;

        /**
         * 商品等级
         */
        @JsonProperty("goods_rate")
        private Long goodsRate;

        /**
         * 优惠券金额
         */
        @JsonProperty("coupon_price")
        private Long couponPrice;

        /**
         * 佣金比例,千分比
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 优惠券失效时间,UNIX时间戳
         */
        @JsonProperty("coupon_end_time")
        private Long couponEndTime;

        /**
         * 优惠券生效时间,UNIX时间戳
         */
        @JsonProperty("coupon_start_time")
        private Long couponStartTime;

        /**
         * 优惠券剩余数量
         */
        @JsonProperty("coupon_remain_quantity")
        private Long couponRemainQuantity;

        /**
         * 优惠券总数量
         */
        @JsonProperty("coupon_total_quantity")
        private Long couponTotalQuantity;

        /**
         * 优惠券面额,单位为分
         */
        @JsonProperty("coupon_discount")
        private Long couponDiscount;

        /**
         * 优惠券门槛价格,单位为分
         */
        @JsonProperty("coupon_min_order_amount")
        private Long couponMinOrderAmount;

        /**
         * 优惠券id
         */
        @JsonProperty("coupon_id")
        private Long couponId;

        /**
         * 商品是否带券,true-带券,false-不带券
         */
        @JsonProperty("has_coupon")
        private Boolean hasCoupon;

        /**
         * 商品类型
         */
        @JsonProperty("goods_type")
        private Integer goodsType;

        /**
         * 商品一~四级类目ID列表
         */
        @JsonProperty("cat_ids")
        private List<Long> catIds;

        /**
         * 商品一~四级标签类目ID列表
         */
        @JsonProperty("opt_ids")
        private List<Long> optIds;

        /**
         * 商品标签名
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * 商品标签类目ID,使用pdd.goods.opt.get获取
         */
        @JsonProperty("opt_id")
        private String optId;

        /**
         * 分类名称
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 类目id
         */
        @JsonProperty("category_id")
        private String categoryId;

        /**
         * 商家类型
         */
        @JsonProperty("merchant_type")
        private String merchantType;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 商家id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 最小单买价格，单位分
         */
        @JsonProperty("min_normal_price")
        private Long minNormalPrice;

        /**
         * 最小成团价格，单位分
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 商品实际价格
         */
        @JsonProperty("goods_fact_price")
        private Long goodsFactPrice;

        /**
         * 商品标准价格
         */
        @JsonProperty("goods_mark_price")
        private Long goodsMarkPrice;

        /**
         * 销售量
         */
        @JsonProperty("sold_quantity")
        private Long soldQuantity;

        /**
         * 商品详情图列表
         */
        @JsonProperty("goods_gallery_urls")
        private String goodsGalleryUrls;

        /**
         * 商品主图
         */
        @JsonProperty("goods_image_url")
        private String goodsImageUrl;

        /**
         * 商品缩略图
         */
        @JsonProperty("goods_thumbnail_url")
        private String goodsThumbnailUrl;

        /**
         * 商品描述
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 创建时间
         */
        @JsonProperty("create_at")
        private Long createAt;

        
        public String getQrCodeImageUrl() {
            return qrCodeImageUrl;
        }

        public String getLockEdit() {
            return lockEdit;
        }

        public String getBroker() {
            return broker;
        }

        public String getRank() {
            return rank;
        }

        public Long getSaleNumToday() {
            return saleNumToday;
        }

        public Long getSaleNum24() {
            return saleNum24;
        }

        public Double getServPct() {
            return servPct;
        }

        public Double getLgstPct() {
            return lgstPct;
        }

        public Double getDescPct() {
            return descPct;
        }

        public Long getAvgServ() {
            return avgServ;
        }

        public Long getAvgLgst() {
            return avgLgst;
        }

        public Long getAvgDesc() {
            return avgDesc;
        }

        public String getShareDesc() {
            return shareDesc;
        }

        public String getCatId() {
            return catId;
        }

        public Long getGoodsEvalCount() {
            return goodsEvalCount;
        }

        public Double getGoodsEvalScore() {
            return goodsEvalScore;
        }

        public Long getMarketFee() {
            return marketFee;
        }

        public Long getGoodsRate() {
            return goodsRate;
        }

        public Long getCouponPrice() {
            return couponPrice;
        }

        public Long getPromotionRate() {
            return promotionRate;
        }

        public Long getCouponEndTime() {
            return couponEndTime;
        }

        public Long getCouponStartTime() {
            return couponStartTime;
        }

        public Long getCouponRemainQuantity() {
            return couponRemainQuantity;
        }

        public Long getCouponTotalQuantity() {
            return couponTotalQuantity;
        }

        public Long getCouponDiscount() {
            return couponDiscount;
        }

        public Long getCouponMinOrderAmount() {
            return couponMinOrderAmount;
        }

        public Long getCouponId() {
            return couponId;
        }

        public Boolean getHasCoupon() {
            return hasCoupon;
        }

        public Integer getGoodsType() {
            return goodsType;
        }

        public List<Long> getCatIds() {
            return catIds;
        }

        public List<Long> getOptIds() {
            return optIds;
        }

        public String getOptName() {
            return optName;
        }

        public String getOptId() {
            return optId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public String getMerchantType() {
            return merchantType;
        }

        public String getMallName() {
            return mallName;
        }

        public Long getMallId() {
            return mallId;
        }

        public Long getMinNormalPrice() {
            return minNormalPrice;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public Long getGoodsFactPrice() {
            return goodsFactPrice;
        }

        public Long getGoodsMarkPrice() {
            return goodsMarkPrice;
        }

        public Long getSoldQuantity() {
            return soldQuantity;
        }

        public String getGoodsGalleryUrls() {
            return goodsGalleryUrls;
        }

        public String getGoodsImageUrl() {
            return goodsImageUrl;
        }

        public String getGoodsThumbnailUrl() {
            return goodsThumbnailUrl;
        }

        public String getGoodsDesc() {
            return goodsDesc;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public Long getCreateAt() {
            return createAt;
        }

        
    }
    
}