package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdQueryUnitBidHistoryReportResponse extends PopBaseHttpResponse{

    /**
     * 开平返回
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    
    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponse {

        /**
         * 列表信息
         */
        @JsonProperty("result")
        private List<ResultItem> result;

        /**
         * 总数
         */
        @JsonProperty("total")
        private Long total;

        
        public List<ResultItem> getResult() {
            return result;
        }

        public Long getTotal() {
            return total;
        }

        
    }
    public static class ResultItem {

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
         * 分天数据日期
         */
        @JsonProperty("date")
        private String date;

        /**
         * 定向状态，0表示未删除，1表示已删除
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 兴趣点名称
         */
        @JsonProperty("sub_level_target_name")
        private String subLevelTargetName;

        /**
         * 兴趣点id
         */
        @JsonProperty("sub_level_target_id")
        private Long subLevelTargetId;

        /**
         * 定向类型
         */
        @JsonProperty("targetType")
        private Integer targettype;

        /**
         * 定向id
         */
        @JsonProperty("target_id")
        private Long targetId;

        /**
         * 单元id
         */
        @JsonProperty("unit_id")
        private Long unitId;

        /**
         * 计划id
         */
        @JsonProperty("plan_id")
        private Long planId;

        /**
         * 广告主ID
         */
        @JsonProperty("mall_id")
        private Long mallId;

        
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

        public String getDate() {
            return date;
        }

        public Integer getStatus() {
            return status;
        }

        public String getSubLevelTargetName() {
            return subLevelTargetName;
        }

        public Long getSubLevelTargetId() {
            return subLevelTargetId;
        }

        public Integer getTargettype() {
            return targettype;
        }

        public Long getTargetId() {
            return targetId;
        }

        public Long getUnitId() {
            return unitId;
        }

        public Long getPlanId() {
            return planId;
        }

        public Long getMallId() {
            return mallId;
        }

        
    }
    
}