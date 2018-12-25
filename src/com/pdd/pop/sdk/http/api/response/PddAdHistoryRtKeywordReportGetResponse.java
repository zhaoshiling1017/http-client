package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdHistoryRtKeywordReportGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_keyword_real_time_report_response")
    private AdKeywordRealTimeReportResponse adKeywordRealTimeReportResponse;

    
    public AdKeywordRealTimeReportResponse getAdKeywordRealTimeReportResponse() {
        return adKeywordRealTimeReportResponse;
    }

    
    public static class AdKeywordRealTimeReportResponse {

        /**
         * report列表
         */
        @JsonProperty("keyword_real_time_report_list")
        private List<KeywordRealTimeReportListItem> keywordRealTimeReportList;

        
        public List<KeywordRealTimeReportListItem> getKeywordRealTimeReportList() {
            return keywordRealTimeReportList;
        }

        
    }
    public static class KeywordRealTimeReportListItem {

        /**
         * 关键词id
         */
        @JsonProperty("keyword_id")
        private Long keywordId;

        /**
         * 关键词
         */
        @JsonProperty("word")
        private String word;

        /**
         * 出价
         */
        @JsonProperty("bid")
        private Long bid;

        /**
         * 关键词状态 1-推广中 2-已删除
         */
        @JsonProperty("impression_status")
        private Integer impressionStatus;

        /**
         * 质量分
         */
        @JsonProperty("quality_score")
        private Long qualityScore;

        /**
         * 1：推广中，2：手动暂停，3：余额不足，4：到达日限额，5：无推广单元，6：已删除
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 广告投资回报率
         */
        @JsonProperty("roi")
        private Double roi;

        /**
         * 千次展现成本
         */
        @JsonProperty("cpm")
        private Double cpm;

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

        
        public Long getKeywordId() {
            return keywordId;
        }

        public String getWord() {
            return word;
        }

        public Long getBid() {
            return bid;
        }

        public Integer getImpressionStatus() {
            return impressionStatus;
        }

        public Long getQualityScore() {
            return qualityScore;
        }

        public Integer getStatus() {
            return status;
        }

        public Double getRoi() {
            return roi;
        }

        public Double getCpm() {
            return cpm;
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
    
}