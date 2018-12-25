package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsPromotionUrlGenerateResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_promotion_url_generate_response")
    private GoodsPromotionUrlGenerateResponse goodsPromotionUrlGenerateResponse;

    
    public GoodsPromotionUrlGenerateResponse getGoodsPromotionUrlGenerateResponse() {
        return goodsPromotionUrlGenerateResponse;
    }

    
    public static class GoodsPromotionUrlGenerateResponse {

        /**
         * 多多进宝推广链接对象列表
         */
        @JsonProperty("goods_promotion_url_list")
        private List<GoodsPromotionUrlListItem> goodsPromotionUrlList;

        
        public List<GoodsPromotionUrlListItem> getGoodsPromotionUrlList() {
            return goodsPromotionUrlList;
        }

        
    }
    public static class GoodsPromotionUrlListItem {

        /**
         * 唤起微信app推广短链接
         */
        @JsonProperty("we_app_web_view_short_url")
        private String weAppWebViewShortUrl;

        /**
         * 唤起微信app推广链接
         */
        @JsonProperty("we_app_web_view_url")
        private String weAppWebViewUrl;

        /**
         * 唤醒拼多多app的推广短链接
         */
        @JsonProperty("mobile_short_url")
        private String mobileShortUrl;

        /**
         * 唤醒拼多多app的推广长链接
         */
        @JsonProperty("mobile_url")
        private String mobileUrl;

        /**
         * 推广短链接
         */
        @JsonProperty("short_url")
        private String shortUrl;

        /**
         * 推广长链接
         */
        @JsonProperty("url")
        private String url;

        /**
         * 小程序信息
         */
        @JsonProperty("we_app_info")
        private WeAppInfo weAppInfo;

        
        public String getWeAppWebViewShortUrl() {
            return weAppWebViewShortUrl;
        }

        public String getWeAppWebViewUrl() {
            return weAppWebViewUrl;
        }

        public String getMobileShortUrl() {
            return mobileShortUrl;
        }

        public String getMobileUrl() {
            return mobileUrl;
        }

        public String getShortUrl() {
            return shortUrl;
        }

        public String getUrl() {
            return url;
        }

        public WeAppInfo getWeAppInfo() {
            return weAppInfo;
        }

        
    }
    public static class WeAppInfo {

        /**
         * 小程序图片
         */
        @JsonProperty("we_app_icon_url")
        private String weAppIconUrl;

        /**
         * Banner图
         */
        @JsonProperty("banner_url")
        private String bannerUrl;

        /**
         * 描述
         */
        @JsonProperty("desc")
        private String desc;

        /**
         * 来源名
         */
        @JsonProperty("source_display_name")
        private String sourceDisplayName;

        /**
         * 小程序path值
         */
        @JsonProperty("page_path")
        private String pagePath;

        /**
         * 用户名
         */
        @JsonProperty("user_name")
        private String userName;

        /**
         * 小程序标题
         */
        @JsonProperty("title")
        private String title;

        /**
         * 拼多多小程序id
         */
        @JsonProperty("app_id")
        private String appId;

        
        public String getWeAppIconUrl() {
            return weAppIconUrl;
        }

        public String getBannerUrl() {
            return bannerUrl;
        }

        public String getDesc() {
            return desc;
        }

        public String getSourceDisplayName() {
            return sourceDisplayName;
        }

        public String getPagePath() {
            return pagePath;
        }

        public String getUserName() {
            return userName;
        }

        public String getTitle() {
            return title;
        }

        public String getAppId() {
            return appId;
        }

        
    }
    
}