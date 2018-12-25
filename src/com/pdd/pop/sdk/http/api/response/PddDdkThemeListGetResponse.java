package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkThemeListGetResponse extends PopBaseHttpResponse{

    /**
     * 主题列表返回对象
     */
    @JsonProperty("theme_list_get_response")
    private ThemeListGetResponse themeListGetResponse;

    
    public ThemeListGetResponse getThemeListGetResponse() {
        return themeListGetResponse;
    }

    
    public static class ThemeListGetResponse {

        /**
         * 返回的元素数量
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 返回的主题列表
         */
        @JsonProperty("theme_list")
        private List<ThemeListItem> themeList;

        
        public Integer getTotal() {
            return total;
        }

        public List<ThemeListItem> getThemeList() {
            return themeList;
        }

        
    }
    public static class ThemeListItem {

        /**
         * 主题ID
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 主题图片
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 主题名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 主题包含的商品数量
         */
        @JsonProperty("goods_num")
        private Long goodsNum;

        
        public Long getId() {
            return id;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getName() {
            return name;
        }

        public Long getGoodsNum() {
            return goodsNum;
        }

        
    }
    
}