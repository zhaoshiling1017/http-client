package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsBasicInfoGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_basic_detail_response")
    private GoodsBasicDetailResponse goodsBasicDetailResponse;

    
    public GoodsBasicDetailResponse getGoodsBasicDetailResponse() {
        return goodsBasicDetailResponse;
    }

    
    public static class GoodsBasicDetailResponse {

        /**
         * list
         */
        @JsonProperty("goods_list")
        private List<GoodsListItem> goodsList;

        
        public List<GoodsListItem> getGoodsList() {
            return goodsList;
        }

        
    }
    public static class GoodsListItem {

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

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
         * 商品缩略图
         */
        @JsonProperty("goods_pic")
        private String goodsPic;

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        
        public Long getGoodsId() {
            return goodsId;
        }

        public Long getMinNormalPrice() {
            return minNormalPrice;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public String getGoodsPic() {
            return goodsPic;
        }

        public String getGoodsName() {
            return goodsName;
        }

        
    }
    
}