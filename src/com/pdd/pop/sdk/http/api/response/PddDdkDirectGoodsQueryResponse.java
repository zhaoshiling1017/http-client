package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkDirectGoodsQueryResponse extends PopBaseHttpResponse{

    /**
     * direct_goods_query_response
     */
    @JsonProperty("direct_goods_query_response")
    private DirectGoodsQueryResponse directGoodsQueryResponse;

    
    public DirectGoodsQueryResponse getDirectGoodsQueryResponse() {
        return directGoodsQueryResponse;
    }

    
    public static class DirectGoodsQueryResponse {

        /**
         * 返回商品总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        /**
         * 多多进宝商品对象列表
         */
        @JsonProperty("list")
        private List<ListItem> list;

        
        public Integer getTotalCount() {
            return totalCount;
        }

        public List<ListItem> getList() {
            return list;
        }

        
    }
    public static class ListItem {

        /**
         * 参与多多进宝的商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

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
         * 最小拼团价格，单位为分
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 最小单买价格，单位为分
         */
        @JsonProperty("min_normal_price")
        private Long minNormalPrice;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 商品标签ID
         */
        @JsonProperty("opt_id")
        private Long optId;

        /**
         * 商品标签名
         */
        @JsonProperty("opt_name")
        private String optName;

        /**
         * 商品类目ID，使用pdd.goods.cats.get接口获取
         */
        @JsonProperty("cat_ids")
        private List<Integer> catIds;

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

        
        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
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

        
    }
    
}