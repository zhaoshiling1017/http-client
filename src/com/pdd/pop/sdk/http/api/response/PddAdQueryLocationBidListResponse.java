package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdQueryLocationBidListResponse extends PopBaseHttpResponse{

    /**
     * 开平返回
     */
    @JsonProperty("open_api_response")
    private List<OpenApiResponseItem> openApiResponse;

    
    public List<OpenApiResponseItem> getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponseItem {

        /**
         * 店铺收藏数
         */
        @JsonProperty("mall_fav_num")
        private Long mallFavNum;

        /**
         * 千次展现成本
         */
        @JsonProperty("cpm")
        private Double cpm;

        /**
         * 广告投资回报率
         */
        @JsonProperty("roi")
        private Double roi;

        /**
         * 广告转化支付金额，单位厘
         */
        @JsonProperty("gmv")
        private Long gmv;

        /**
         * 广告转化支付订单数
         */
        @JsonProperty("order_num")
        private Long orderNum;

        /**
         * 点击单价，单位厘
         */
        @JsonProperty("cpc")
        private Double cpc;

        /**
         * 广告消耗,单位厘
         */
        @JsonProperty("spend")
        private Long spend;

        /**
         * 广告点击率
         */
        @JsonProperty("ctr")
        private Double ctr;

        /**
         * 广告点击数
         */
        @JsonProperty("click")
        private Integer click;

        /**
         * 广告曝光数
         */
        @JsonProperty("impression")
        private Integer impression;

        /**
         * 溢价比例
         */
        @JsonProperty("bid_premium_rate")
        private Integer bidPremiumRate;

        /**
         * 资源位类型（0：基础流量包，1：类目商品页，2：商品详情页，3：营销活动页）
         */
        @JsonProperty("location_type")
        private Integer locationType;

        /**
         * 资源位ID（基础流量包没有ID）
         */
        @JsonProperty("location_bid_id")
        private Long locationBidId;

        
        public Long getMallFavNum() {
            return mallFavNum;
        }

        public Double getCpm() {
            return cpm;
        }

        public Double getRoi() {
            return roi;
        }

        public Long getGmv() {
            return gmv;
        }

        public Long getOrderNum() {
            return orderNum;
        }

        public Double getCpc() {
            return cpc;
        }

        public Long getSpend() {
            return spend;
        }

        public Double getCtr() {
            return ctr;
        }

        public Integer getClick() {
            return click;
        }

        public Integer getImpression() {
            return impression;
        }

        public Integer getBidPremiumRate() {
            return bidPremiumRate;
        }

        public Integer getLocationType() {
            return locationType;
        }

        public Long getLocationBidId() {
            return locationBidId;
        }

        
    }
    
}