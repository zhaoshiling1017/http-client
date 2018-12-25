package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdCreativeQueryResponse extends PopBaseHttpResponse{

    /**
     * List<Object>
     */
    @JsonProperty("open_api_response")
    private List<OpenApiResponseItem> openApiResponse;

    
    public List<OpenApiResponseItem> getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponseItem {

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
         * 状态：1-推广中，2-手动暂停，3-已删除
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 销量
         */
        @JsonProperty("sold_quantity")
        private Long soldQuantity;

        /**
         * 最小团购价
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 广告主操作状态：1-有效，2-暂停
         */
        @JsonProperty("operate_status")
        private Integer operateStatus;

        /**
         * 图高
         */
        @JsonProperty("image_height")
        private Integer imageHeight;

        /**
         * 图宽
         */
        @JsonProperty("image_width")
        private Integer imageWidth;

        /**
         * 图片地址
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 图片id
         */
        @JsonProperty("image_id")
        private Long imageId;

        /**
         * 标题
         */
        @JsonProperty("title")
        private String title;

        /**
         * 创意id
         */
        @JsonProperty("creative_id")
        private Long creativeId;

        
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

        public Integer getStatus() {
            return status;
        }

        public Long getSoldQuantity() {
            return soldQuantity;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public Integer getOperateStatus() {
            return operateStatus;
        }

        public Integer getImageHeight() {
            return imageHeight;
        }

        public Integer getImageWidth() {
            return imageWidth;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public Long getImageId() {
            return imageId;
        }

        public String getTitle() {
            return title;
        }

        public Long getCreativeId() {
            return creativeId;
        }

        
    }
    
}