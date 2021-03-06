package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;


import java.util.Map;

public class PddAdHistoryUnitReportGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_unit_history_report_get_response")
    private AdUnitHistoryReportGetResponse adUnitHistoryReportGetResponse;

    
    public AdUnitHistoryReportGetResponse getAdUnitHistoryReportGetResponse() {
        return adUnitHistoryReportGetResponse;
    }

    
    public static class AdUnitHistoryReportGetResponse {

        /**
         * 总数
         */
        @JsonProperty("total")
        private Long total;

        /**
         * report列表
         */
        @JsonProperty("result")
        private List<ResultItem> result;

        
        public Long getTotal() {
            return total;
        }

        public List<ResultItem> getResult() {
            return result;
        }

        
    }
    public static class ResultItem {

        /**
         * 扩展字段
         */
        @JsonProperty("external_fields")
        private Map<Object, Object> externalFields;

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

        
        public Map<Object, Object> getExternalFields() {
            return externalFields;
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
    
}