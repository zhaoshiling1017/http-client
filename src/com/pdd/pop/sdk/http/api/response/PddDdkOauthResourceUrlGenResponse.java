package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddDdkOauthResourceUrlGenResponse extends PopBaseHttpResponse{

    /**
     * resource_url_response
     */
    @JsonProperty("resource_url_response")
    private ResourceUrlResponse resourceUrlResponse;

    
    public ResourceUrlResponse getResourceUrlResponse() {
        return resourceUrlResponse;
    }

    
    public static class SingleUrlList {

        /**
         * 频道推广长链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 频道推广短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 频道推广唤醒拼多多APP长链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 频道推广唤醒拼多多APP短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 频道推广唤醒微信长链接
         */
        @JsonProperty("we_app_web_view_url")
        private String weAppWebViewUrl;

        /**
         * 频道推广唤醒微信短链接
         */
        @JsonProperty("we_app_web_view_short_url")
        private String weAppWebViewShortUrl;

        /**
         * 小程序信息
         */
        @JsonProperty("we_app_page_path")
        private String weAppPagePath;

        
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

        public String getWeAppWebViewUrl() {
            return weAppWebViewUrl;
        }

        public String getWeAppWebViewShortUrl() {
            return weAppWebViewShortUrl;
        }

        public String getWeAppPagePath() {
            return weAppPagePath;
        }

        
    }
    public static class MultiUrlList {

        /**
         * 频道推广长链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 频道推广短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 频道推广唤醒拼多多APP长链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 频道推广唤醒拼多多APP短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 频道推广唤醒微信长链接
         */
        @JsonProperty("we_app_web_view_url")
        private String weAppWebViewUrl;

        /**
         * 频道推广唤醒微信短链接
         */
        @JsonProperty("we_app_web_view_short_url")
        private String weAppWebViewShortUrl;

        /**
         * 小程序信息
         */
        @JsonProperty("we_app_page_path")
        private String weAppPagePath;

        
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

        public String getWeAppWebViewUrl() {
            return weAppWebViewUrl;
        }

        public String getWeAppWebViewShortUrl() {
            return weAppWebViewShortUrl;
        }

        public String getWeAppPagePath() {
            return weAppPagePath;
        }

        
    }
    public static class ResourceUrlResponse {

        /**
         * 单人团链接
         */
        @JsonProperty("single_url_list")
        private SingleUrlList singleUrlList;

        /**
         * 多人团链接
         */
        @JsonProperty("multi_url_list")
        private MultiUrlList multiUrlList;

        
        public SingleUrlList getSingleUrlList() {
            return singleUrlList;
        }

        public MultiUrlList getMultiUrlList() {
            return multiUrlList;
        }

        
    }
    
}