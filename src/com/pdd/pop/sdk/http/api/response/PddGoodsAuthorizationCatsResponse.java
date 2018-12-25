package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsAuthorizationCatsResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_auth_cats_get_response")
    private GoodsAuthCatsGetResponse goodsAuthCatsGetResponse;

    
    public GoodsAuthCatsGetResponse getGoodsAuthCatsGetResponse() {
        return goodsAuthCatsGetResponse;
    }

    
    public static class GoodsAuthCatsGetResponse {

        /**
         * 类目对象列表
         */
        @JsonProperty("goods_cats_list")
        private List<GoodsCatsListItem> goodsCatsList;

        
        public List<GoodsCatsListItem> getGoodsCatsList() {
            return goodsCatsList;
        }

        
    }
    public static class GoodsCatsListItem {

        /**
         * 对应ID下的类目名称
         */
        @JsonProperty("cat_name")
        private String catName;

        /**
         * 类目ID，一级类目ID
         */
        @JsonProperty("cat_id")
        private Long catId;

        
        public String getCatName() {
            return catName;
        }

        public Long getCatId() {
            return catId;
        }

        
    }
    
}