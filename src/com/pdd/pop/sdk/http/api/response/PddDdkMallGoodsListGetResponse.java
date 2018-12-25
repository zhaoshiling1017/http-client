package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkMallGoodsListGetResponse extends PopBaseHttpResponse{

    /**
     * goods_info_list_response
     */
    @JsonProperty("goods_info_list_response")
    private GoodsInfoListResponse goodsInfoListResponse;

    
    public GoodsInfoListResponse getGoodsInfoListResponse() {
        return goodsInfoListResponse;
    }

    
    public static class GoodsInfoListResponse {

        /**
         * 返回商品总数
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 商品信息列表，具体信息见下（注：目前仅返回商品基础信息，其余为空，凡示例中为null的目前均返回为空，获取这些字段请调用pdd.ddk.goods,detail接口）
         */
        @JsonProperty("goods_list")
        private List<GoodsListItem> goodsList;

        
        public Integer getTotal() {
            return total;
        }

        public List<GoodsListItem> getGoodsList() {
            return goodsList;
        }

        
    }
    public static class GoodsListItem {

        /**
         * 商品创建时间（UNIX时间戳）
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
        private String goodsGalleryUrls;

        /**
         * 已售卖件数
         */
        @JsonProperty("sold_quantity")
        private Long soldQuantity;

        /**
         * 商品市场价（单位为分）
         */
        @JsonProperty("goods_mark_price")
        private Long goodsMarkPrice;

        /**
         * 商品实际价格（单位为分）
         */
        @JsonProperty("goods_fact_price")
        private Long goodsFactPrice;

        /**
         * 商品拼团价（单位为分）
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 商品单买价（单位为分）
         */
        @JsonProperty("min_normal_price")
        private Long minNormalPrice;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 店铺类型，1-个人，2-企业，3-旗舰店，4-专卖店，5-专营店，6-普通店（未传为全部）
         */
        @JsonProperty("merchant_type")
        private Integer merchantType;

        /**
         * 商品类目id
         */
        @JsonProperty("category_id")
        private Long categoryId;

        /**
         * 商品类目名
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 商品标签id
         */
        @JsonProperty("opt_id")
        private Long optId;

        /**
         * 商品标签名
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * 商品标签ID
         */
        @JsonProperty("opt_ids")
        private List<Long> optIds;

        /**
         * 商品标签ID（多级）
         */
        @JsonProperty("cat_ids")
        private List<Long> catIds;

        /**
         * 商品类型，1-普通商品，2-进口商品，3-直供，4-直邮
         */
        @JsonProperty("goods_type")
        private Integer goodsType;

        /**
         * 是否有优惠券
         */
        @JsonProperty("has_coupon")
        private Boolean hasCoupon;

        /**
         * 优惠券ID
         */
        @JsonProperty("coupon_id")
        private Long couponId;

        /**
         * 优惠券最小门槛价（单位为分）
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
         * 优惠券开始时间（unix时间戳）
         */
        @JsonProperty("coupon_start_time")
        private Long couponStartTime;

        /**
         * 优惠券结束时间（unix时间戳）
         */
        @JsonProperty("coupon_end_time")
        private Long couponEndTime;

        /**
         * 佣金比（千分比）
         */
        @JsonProperty("promotion_rate")
        private Long promotionRate;

        /**
         * 优惠券面额
         */
        @JsonProperty("coupon_price")
        private Long couponPrice;

        /**
         * 商品佣金比（千分比）
         */
        @JsonProperty("goods_rate")
        private Long goodsRate;

        /**
         * 佣金（单位为分）
         */
        @JsonProperty("market_fee")
        private Long marketFee;

        /**
         * 该商品所在店铺是否参与全店推广，0：否，1：是
         */
        @JsonProperty("mall_cps")
        private Integer mallCps;

        /**
         * 商品评价分
         */
        @JsonProperty("goods_eval_score")
        private Double goodsEvalScore;

        /**
         * 商品评价数
         */
        @JsonProperty("goods_eval_count")
        private Long goodsEvalCount;

        /**
         * 商品类目ID
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 分享文案
         */
        @JsonProperty("share_desc")
        private String shareDesc;

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
        private Long descPct;

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

        /**
         * 最近24小时多多进宝商品销量
         */
        @JsonProperty("sale_num24")
        private Long saleNum24;

        /**
         * 今日销量
         */
        @JsonProperty("sale_num_today")
        private Long saleNumToday;

        /**
         * 商品排名
         */
        @JsonProperty("rank")
        private Long rank;

        /**
         * 对接小二
         */
        @JsonProperty("broker")
        private String broker;

        /**
         * 锁定编辑状态
         */
        @JsonProperty("lock_edit")
        private Integer lockEdit;

        /**
         * 聊天二维码图片url
         */
        @JsonProperty("qr_code_image_url")
        private String qrCodeImageUrl;

        /**
         * 全店推广店铺佣金比（千分比）
         */
        @JsonProperty("mall_rate")
        private Long mallRate;

        
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

        public String getGoodsGalleryUrls() {
            return goodsGalleryUrls;
        }

        public Long getSoldQuantity() {
            return soldQuantity;
        }

        public Long getGoodsMarkPrice() {
            return goodsMarkPrice;
        }

        public Long getGoodsFactPrice() {
            return goodsFactPrice;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public Long getMinNormalPrice() {
            return minNormalPrice;
        }

        public Long getMallId() {
            return mallId;
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

        public Integer getGoodsType() {
            return goodsType;
        }

        public Boolean getHasCoupon() {
            return hasCoupon;
        }

        public Long getCouponId() {
            return couponId;
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

        public Long getCouponPrice() {
            return couponPrice;
        }

        public Long getGoodsRate() {
            return goodsRate;
        }

        public Long getMarketFee() {
            return marketFee;
        }

        public Integer getMallCps() {
            return mallCps;
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

        public String getShareDesc() {
            return shareDesc;
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

        public Long getDescPct() {
            return descPct;
        }

        public Double getLgstPct() {
            return lgstPct;
        }

        public Double getServPct() {
            return servPct;
        }

        public Long getSaleNum24() {
            return saleNum24;
        }

        public Long getSaleNumToday() {
            return saleNumToday;
        }

        public Long getRank() {
            return rank;
        }

        public String getBroker() {
            return broker;
        }

        public Integer getLockEdit() {
            return lockEdit;
        }

        public String getQrCodeImageUrl() {
            return qrCodeImageUrl;
        }

        public Long getMallRate() {
            return mallRate;
        }

        
    }
    
}