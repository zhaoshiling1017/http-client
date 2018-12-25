package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsListGetResponse extends PopBaseHttpResponse{

    /**
     * 商品列表响应对象
     */
    @JsonProperty("goods_list_get_response")
    private GoodsListGetResponse goodsListGetResponse;

    
    public GoodsListGetResponse getGoodsListGetResponse() {
        return goodsListGetResponse;
    }

    
    public static class GoodsListGetResponse {

        /**
         * 返回商品总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        /**
         * 商品列表对象
         */
        @JsonProperty("goods_list")
        private List<GoodsListItem> goodsList;

        
        public Integer getTotalCount() {
            return totalCount;
        }

        public List<GoodsListItem> getGoodsList() {
            return goodsList;
        }

        
    }
    public static class GoodsListItem {

        /**
         * 商品缩略图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

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
         * 商品图片
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 是否多sku，0-单sku，1-多sku
         */
        @JsonProperty("is_more_sku")
        private Integer isMoreSku;

        /**
         * 商品总数量
         */
        @JsonProperty("goods_quantity")
        private Long goodsQuantity;

        /**
         * 是否在架上，0-下架中，1-架上
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * sku列表对象
         */
        @JsonProperty("sku_list")
        private List<SkuListItem> skuList;

        
        public String getThumbUrl() {
            return thumbUrl;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public Integer getIsMoreSku() {
            return isMoreSku;
        }

        public Long getGoodsQuantity() {
            return goodsQuantity;
        }

        public Integer getIsOnsale() {
            return isOnsale;
        }

        public List<SkuListItem> getSkuList() {
            return skuList;
        }

        
    }
    public static class SkuListItem {

        /**
         * 规格名称
         */
        @JsonProperty("spec")
        private String spec;

        /**
         * sku编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * sku库存
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
         * sku是否在架上，0-下架中，1-架上
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

        public Integer getIsSkuOnsale() {
            return isSkuOnsale;
        }

        
    }
    
}