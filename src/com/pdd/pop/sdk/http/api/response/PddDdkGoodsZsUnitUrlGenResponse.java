package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddDdkGoodsZsUnitUrlGenResponse extends PopBaseHttpResponse{

    /**
     * goods_zs_unit_generate_response
     */
    @JsonProperty("goods_zs_unit_generate_response")
    private GoodsZsUnitGenerateResponse goodsZsUnitGenerateResponse;

    
    public GoodsZsUnitGenerateResponse getGoodsZsUnitGenerateResponse() {
        return goodsZsUnitGenerateResponse;
    }

    
    public static class GoodsZsUnitGenerateResponse {

        /**
         * 单人团推广长链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 单人团推广短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 推广长链接（唤起拼多多app）
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 推广短链接（可唤起拼多多app）
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 双人团推广长链接
         */
        @JsonProperty("multi_group_url")
        private String multiGroupUrl;

        /**
         * 双人团推广短链接
         */
        @JsonProperty("multi_group_short_url")
        private String multiGroupShortUrl;

        /**
         * 推广长链接（可唤起拼多多app）
         */
        @JsonProperty("multi_group_mobile_url")
        private String multiGroupMobileUrl;

        /**
         * 推广短链接（唤起拼多多app）
         */
        @JsonProperty("multi_group_mobile_short_url")
        private String multiGroupMobileShortUrl;

        
        public String getUrl() {
            return url;
        }

        public String getShortUrl() {
            return shortUrl;
        }

        public String getMobileUrl() {
            return mobileUrl;
        }

        public String getMobileShortUrl() {
            return mobileShortUrl;
        }

        public String getMultiGroupUrl() {
            return multiGroupUrl;
        }

        public String getMultiGroupShortUrl() {
            return multiGroupShortUrl;
        }

        public String getMultiGroupMobileUrl() {
            return multiGroupMobileUrl;
        }

        public String getMultiGroupMobileShortUrl() {
            return multiGroupMobileShortUrl;
        }

        
    }
    
}