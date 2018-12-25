package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkOauthMallUrlGenResponse extends PopBaseHttpResponse{

    /**
     * mall_coupon_generate_url_response
     */
    @JsonProperty("mall_coupon_generate_url_response")
    private MallCouponGenerateUrlResponse mallCouponGenerateUrlResponse;

    
    public MallCouponGenerateUrlResponse getMallCouponGenerateUrlResponse() {
        return mallCouponGenerateUrlResponse;
    }

    
    public static class MallCouponGenerateUrlResponse {

        /**
         * 推广链接
         */
        @JsonProperty("list")
        private List<ListItem> list;

        
        public List<ListItem> getList() {
            return list;
        }

        
    }
    public static class ListItem {

        /**
         * 推广长链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 推广短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 唤醒拼多多app的推广长链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 唤醒拼多多app的推广短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 唤起微信app推广链接
         */
        @JsonProperty("we_app_web_view_url")
        private String weAppWebViewUrl;

        /**
         * 唤起微信app推广短链接
         */
        @JsonProperty("we_app_web_view_short_url")
        private String weAppWebViewShortUrl;

        
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

        
    }
    
}