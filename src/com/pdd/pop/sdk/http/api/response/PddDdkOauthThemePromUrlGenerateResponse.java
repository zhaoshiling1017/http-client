package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkOauthThemePromUrlGenerateResponse extends PopBaseHttpResponse{

    /**
     * 主题活动推广链接返回对象
     */
    @JsonProperty("theme_promotion_url_generate_response")
    private ThemePromotionUrlGenerateResponse themePromotionUrlGenerateResponse;

    
    public ThemePromotionUrlGenerateResponse getThemePromotionUrlGenerateResponse() {
        return themePromotionUrlGenerateResponse;
    }

    
    public static class ThemePromotionUrlGenerateResponse {

        /**
         * url_list
         */
        @JsonProperty("url_list")
        private List<UrlListItem> urlList;

        
        public List<UrlListItem> getUrlList() {
            return urlList;
        }

        
    }
    public static class UrlListItem {

        /**
         * 主题活动推广链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 主题活动推广短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 主题活动推广移动链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 主题活动推广移动短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 主题活动推广多人团链接
         */
        @JsonProperty("multi_group_url")
        private String multiGroupUrl;

        /**
         * 主题活动推广多人团短链接
         */
        @JsonProperty("multi_group_short_url")
        private String multiGroupShortUrl;

        /**
         * 主题活动推广多人团移动链接
         */
        @JsonProperty("multi_group_mobile_url")
        private String multiGroupMobileUrl;

        /**
         * 主题活动推广多人团移动短链接
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