package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdQueryBidListResponse extends PopBaseHttpResponse{

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
         * 溢价比例（非通投时使用）
         */
        @JsonProperty("bid_premium_rate")
        private Integer bidPremiumRate;

        /**
         * 溢价绝对值，单位厘（targetType=1，通投时使用这个值）
         */
        @JsonProperty("bid")
        private Long bid;

        /**
         * 兴趣点名称
         */
        @JsonProperty("sub_level_target_name")
        private String subLevelTargetName;

        /**
         * 兴趣点ID
         */
        @JsonProperty("sub_level_target_id")
        private Long subLevelTargetId;

        /**
         * 定向类型
         */
        @JsonProperty("target_type")
        private Integer targetType;

        /**
         * 定向ID
         */
        @JsonProperty("bid_id")
        private Long bidId;

        
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

        public Long getBid() {
            return bid;
        }

        public String getSubLevelTargetName() {
            return subLevelTargetName;
        }

        public Long getSubLevelTargetId() {
            return subLevelTargetId;
        }

        public Integer getTargetType() {
            return targetType;
        }

        public Long getBidId() {
            return bidId;
        }

        
    }
    
}