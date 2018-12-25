package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsInformationGetResponse extends PopBaseHttpResponse{

    /**
     * 商品详情响应对象
     */
    @JsonProperty("goods_info_get_response")
    private GoodsInfoGetResponse goodsInfoGetResponse;

    
    public GoodsInfoGetResponse getGoodsInfoGetResponse() {
        return goodsInfoGetResponse;
    }

    
    public static class SkuListItem {

        /**
         * 商品规格名称
         */
        @JsonProperty("spec")
        private String spec;

        /**
         * 商品sku编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 商品sku库存
         */
        @JsonProperty("sku_quantity")
        private Long skuQuantity;

        /**
         * 商家外部编码（sku），同其他接口中的outer_id 、out_id、out_sku_sn、outer_sku_sn、out_sku_id、outer_sku_id 都为商家编码（sku维度）。
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * 商家外部编码（商品），同其他接口中的outer_goods_id 、out_goods_id、out_goods_sn、outer_goods_sn 都为商家编码（goods维度）。
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * sku预览图
         */
        @JsonProperty("sku_img")
        private String skuImg;

        /**
         * 拼团价格（元）
         */
        @JsonProperty("group_price")
        private String groupPrice;

        /**
         * 单买价格（元）
         */
        @JsonProperty("single_price")
        private String singlePrice;

        /**
         * 商品sku是否上架，0-下架，1-上架
         */
        @JsonProperty("is_sku_onsale")
        private Integer isSkuOnsale;

        
        public String getSpec() {
            return spec;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Long getSkuQuantity() {
            return skuQuantity;
        }

        public String getOuterId() {
            return outerId;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getSkuImg() {
            return skuImg;
        }

        public String getGroupPrice() {
            return groupPrice;
        }

        public String getSinglePrice() {
            return singlePrice;
        }

        public Integer getIsSkuOnsale() {
            return isSkuOnsale;
        }

        
    }
    public static class GoodsInfoGetResponse {

        /**
         * 商品详情对象
         */
        @JsonProperty("goods_info")
        private GoodsInfo goodsInfo;

        
        public GoodsInfo getGoodsInfo() {
            return goodsInfo;
        }

        
    }
    public static class GoodsInfo {

        /**
         * 商品编码
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品序列编码
         */
        @JsonProperty("goods_sn")
        private String goodsSn;

        /**
         * 商品类型，1-普通商品，2-进口商品，3-直供，4-直邮
         */
        @JsonProperty("goods_type")
        private Integer goodsType;

        /**
         * 商品一级类目
         */
        @JsonProperty("goods_category")
        private String goodsCategory;

        /**
         * 叶子类目
         */
        @JsonProperty("last_category")
        private String lastCategory;

        /**
         * 是否七天无理由售后，0-不支持，1-支持
         */
        @JsonProperty("is_refundable")
        private Integer isRefundable;

        /**
         * 承诺发货时间
         */
        @JsonProperty("shipment_limit_second")
        private Long shipmentLimitSecond;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品图片 url
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 商品库存
         */
        @JsonProperty("goods_quantity")
        private Integer goodsQuantity;

        /**
         * 商品是否上架，0-下架，1-上架；
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * 商品是否全新，0-全新商品，1-二手商品
         */
        @JsonProperty("second_hand")
        private Integer secondHand;

        /**
         * 成团人数
         */
        @JsonProperty("group_required_customer_num")
        private Long groupRequiredCustomerNum;

        /**
         * sku列表对象
         */
        @JsonProperty("sku_list")
        private List<SkuListItem> skuList;

        
        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsSn() {
            return goodsSn;
        }

        public Integer getGoodsType() {
            return goodsType;
        }

        public String getGoodsCategory() {
            return goodsCategory;
        }

        public String getLastCategory() {
            return lastCategory;
        }

        public Integer getIsRefundable() {
            return isRefundable;
        }

        public Long getShipmentLimitSecond() {
            return shipmentLimitSecond;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public Integer getGoodsQuantity() {
            return goodsQuantity;
        }

        public Integer getIsOnsale() {
            return isOnsale;
        }

        public Integer getSecondHand() {
            return secondHand;
        }

        public Long getGroupRequiredCustomerNum() {
            return groupRequiredCustomerNum;
        }

        public List<SkuListItem> getSkuList() {
            return skuList;
        }

        
    }
    
}