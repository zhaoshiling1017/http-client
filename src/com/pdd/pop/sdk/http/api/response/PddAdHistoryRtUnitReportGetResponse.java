package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdHistoryRtUnitReportGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_unit_real_time_report_response")
    private AdUnitRealTimeReportResponse adUnitRealTimeReportResponse;

    
    public AdUnitRealTimeReportResponse getAdUnitRealTimeReportResponse() {
        return adUnitRealTimeReportResponse;
    }

    
    public static class AdUnitRealTimeReportResponse {

        /**
         * 报表对象列表
         */
        @JsonProperty("unit_real_time_report_list")
        private List<UnitRealTimeReportListItem> unitRealTimeReportList;

        
        public List<UnitRealTimeReportListItem> getUnitRealTimeReportList() {
            return unitRealTimeReportList;
        }

        
    }
    public static class UnitRealTimeReportListItem {

        /**
         * 1：推广中，2：手动暂停，3：余额不足，4：到达日限额，5：无推广单元，6：已删除
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 计划id
         */
        @JsonProperty("plan_id")
        private Long planId;

        /**
         * 单元id
         */
        @JsonProperty("unit_id")
        private Long unitId;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 1：已启用，2：未启用
         */
        @JsonProperty("operate_status")
        private Integer operateStatus;

        /**
         * 商品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品图片url
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 最小团购价
         */
        @JsonProperty("min_group_price")
        private Long minGroupPrice;

        /**
         * 最大团购价
         */
        @JsonProperty("max_group_price")
        private Long maxGroupPrice;

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

        
        public Integer getStatus() {
            return status;
        }

        public Long getPlanId() {
            return planId;
        }

        public Long getUnitId() {
            return unitId;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public Integer getOperateStatus() {
            return operateStatus;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public Long getMinGroupPrice() {
            return minGroupPrice;
        }

        public Long getMaxGroupPrice() {
            return maxGroupPrice;
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