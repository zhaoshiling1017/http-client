package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdHistoryReportGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_mall_history_report_response")
    private AdMallHistoryReportResponse adMallHistoryReportResponse;

    
    public AdMallHistoryReportResponse getAdMallHistoryReportResponse() {
        return adMallHistoryReportResponse;
    }

    
    public static class MallHistoryReportListItem {

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
         * 广告曝光数
         */
        @JsonProperty("impression")
        private Long impression;

        /**
         * 广告点击数
         */
        @JsonProperty("click")
        private Long click;

        /**
         * 广告点击率
         */
        @JsonProperty("ctr")
        private Double ctr;

        /**
         * 广告消耗,单位厘
         */
        @JsonProperty("spend")
        private Long spend;

        /**
         * 点击单价，单位厘
         */
        @JsonProperty("cpc")
        private Double cpc;

        /**
         * 广告转化支付订单数
         */
        @JsonProperty("order_num")
        private Long orderNum;

        /**
         * 广告转化支付金额，单位厘
         */
        @JsonProperty("gmv")
        private Long gmv;

        /**
         * 日期
         */
        @JsonProperty("date")
        private String date;

        
        public Double getCpm() {
            return cpm;
        }

        public Double getRoi() {
            return roi;
        }

        public Long getImpression() {
            return impression;
        }

        public Long getClick() {
            return click;
        }

        public Double getCtr() {
            return ctr;
        }

        public Long getSpend() {
            return spend;
        }

        public Double getCpc() {
            return cpc;
        }

        public Long getOrderNum() {
            return orderNum;
        }

        public Long getGmv() {
            return gmv;
        }

        public String getDate() {
            return date;
        }

        
    }
    public static class AdMallHistoryReportResponse {

        /**
         * 历史report列表
         */
        @JsonProperty("mall_history_report_list")
        private List<MallHistoryReportListItem> mallHistoryReportList;

        
        public List<MallHistoryReportListItem> getMallHistoryReportList() {
            return mallHistoryReportList;
        }

        
    }
    
}