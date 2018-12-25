package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsSpecGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_spec_get_response")
    private GoodsSpecGetResponse goodsSpecGetResponse;

    
    public GoodsSpecGetResponse getGoodsSpecGetResponse() {
        return goodsSpecGetResponse;
    }

    
    public static class GoodsSpecListItem {

        /**
         * 规格所属的叶子类目ID
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 商品规格对应的ID
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 商品规格ID对应的规格名称
         */
        @JsonProperty("parent_spec_name")
        private String parentSpecName;

        
        public Long getCatId() {
            return catId;
        }

        public Long getParentSpecId() {
            return parentSpecId;
        }

        public String getParentSpecName() {
            return parentSpecName;
        }

        
    }
    public static class GoodsSpecGetResponse {

        /**
         * 规格列表对象
         */
        @JsonProperty("goods_spec_list")
        private List<GoodsSpecListItem> goodsSpecList;

        
        public List<GoodsSpecListItem> getGoodsSpecList() {
            return goodsSpecList;
        }

        
    }
    
}