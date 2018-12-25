package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdChartBykeywordGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("ad_keyword_daily_report_response")
    private AdKeywordDailyReportResponse adKeywordDailyReportResponse;

    
    public AdKeywordDailyReportResponse getAdKeywordDailyReportResponse() {
        return adKeywordDailyReportResponse;
    }

    
    public static class AdInfo {

        /**
         * 推广计划名称
         */
        @JsonProperty("plan_name")
        private String planName;

        /**
         * 推广计划中的关键词
         */
        @JsonProperty("keyword")
        private String keyword;

        
        public String getPlanName() {
            return planName;
        }

        public String getKeyword() {
            return keyword;
        }

        
    }
    public static class AdKeywordDailyReportResponse {

        /**
         * 返回的关键词报表总条数
         */
        @JsonProperty("total_count")
        private Long totalCount;

        /**
         * 数据报表对象
         */
        @JsonProperty("keyword_daily_report_list")
        private List<KeywordDailyReportListItem> keywordDailyReportList;

        
        public Long getTotalCount() {
            return totalCount;
        }

        public List<KeywordDailyReportListItem> getKeywordDailyReportList() {
            return keywordDailyReportList;
        }

        
    }
    public static class KeywordDailyReportListItem {

        /**
         * 订单数据
         */
        @JsonProperty("conversion")
        private Conversion conversion;

        /**
         * 日期
         */
        @JsonProperty("date")
        private String date;

        /**
         * 计划信息
         */
        @JsonProperty("ad_info")
        private AdInfo adInfo;

        /**
         * 点击量数据
         */
        @JsonProperty("click_num")
        private Long clickNum;

        /**
         * 展现量数据
         */
        @JsonProperty("impression_num")
        private Long impressionNum;

        /**
         * 广告花费，单位为分
         */
        @JsonProperty("spend")
        private Long spend;

        
        public Conversion getConversion() {
            return conversion;
        }

        public String getDate() {
            return date;
        }

        public AdInfo getAdInfo() {
            return adInfo;
        }

        public Long getClickNum() {
            return clickNum;
        }

        public Long getImpressionNum() {
            return impressionNum;
        }

        public Long getSpend() {
            return spend;
        }

        
    }
    public static class Conversion {

        /**
         * 总推广订单数
         */
        @JsonProperty("total_order_num")
        private Long totalOrderNum;

        /**
         * 总推广订单金额
         */
        @JsonProperty("total_gmv")
        private Long totalGmv;

        /**
         * 直接发生购买转化的订单总销售金额，单位为分
         */
        @JsonProperty("direct_gmv")
        private Long directGmv;

        /**
         * 直接发生购买转化的订单数
         */
        @JsonProperty("direct_order_num")
        private Long directOrderNum;

        
        public Long getTotalOrderNum() {
            return totalOrderNum;
        }

        public Long getTotalGmv() {
            return totalGmv;
        }

        public Long getDirectGmv() {
            return directGmv;
        }

        public Long getDirectOrderNum() {
            return directOrderNum;
        }

        
    }
    
}