package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkLotteryUrlGenResponse extends PopBaseHttpResponse{

    /**
     * lottery_url_response
     */
    @JsonProperty("lottery_url_response")
    private LotteryUrlResponse lotteryUrlResponse;

    
    public LotteryUrlResponse getLotteryUrlResponse() {
        return lotteryUrlResponse;
    }

    
    public static class LotteryUrlResponse {

        /**
         * 返回总数
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 推广链接
         */
        @JsonProperty("url_list")
        private List<UrlListItem> urlList;

        
        public Integer getTotal() {
            return total;
        }

        public List<UrlListItem> getUrlList() {
            return urlList;
        }

        
    }
    public static class UrlListItem {

        /**
         * 转盘抽免单单人团链接
         */
        @JsonProperty("single_url_list")
        private SingleUrlList singleUrlList;

        /**
         * 转盘抽免单多人团链接
         */
        @JsonProperty("multi_url_list")
        private MultiUrlList multiUrlList;

        /**
         * 自定义参数
         */
        @JsonProperty("sign")
        private String sign;

        
        public SingleUrlList getSingleUrlList() {
            return singleUrlList;
        }

        public MultiUrlList getMultiUrlList() {
            return multiUrlList;
        }

        public String getSign() {
            return sign;
        }

        
    }
    public static class SingleUrlList {

        /**
         * 转盘抽免单长链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 转盘抽免单短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 转盘抽免单唤醒APP长链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 转盘抽免单唤醒APP短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 转盘抽免单唤醒微信长链接
         */
        @JsonProperty("we_app_web_view_url")
        private String weAppWebViewUrl;

        /**
         * 转盘抽免单唤醒微信短链接
         */
        @JsonProperty("we_app_web_view_short_url")
        private String weAppWebViewShortUrl;

        /**
         * 转盘抽免单小程序短链接
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
         * 转盘抽免单长链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 转盘抽免单短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 转盘抽免单唤醒拼多多APP长链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 转盘抽免单唤醒拼多多APP短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 转盘抽免单唤醒微信长链接
         */
        @JsonProperty("we_app_web_view_url")
        private String weAppWebViewUrl;

        /**
         * 转盘抽免单唤醒微信短链接
         */
        @JsonProperty("we_app_web_view_short_url")
        private String weAppWebViewShortUrl;

        /**
         * 转盘抽免单小程序链接
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
    
}