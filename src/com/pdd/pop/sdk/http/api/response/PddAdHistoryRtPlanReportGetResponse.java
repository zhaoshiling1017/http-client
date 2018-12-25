package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdHistoryRtPlanReportGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_plan_real_time_report_response")
    private AdPlanRealTimeReportResponse adPlanRealTimeReportResponse;

    
    public AdPlanRealTimeReportResponse getAdPlanRealTimeReportResponse() {
        return adPlanRealTimeReportResponse;
    }

    
    public static class AdPlanRealTimeReportResponse {

        /**
         * 报表对象列表
         */
        @JsonProperty("plan_real_time_report_list")
        private List<PlanRealTimeReportListItem> planRealTimeReportList;

        
        public List<PlanRealTimeReportListItem> getPlanRealTimeReportList() {
            return planRealTimeReportList;
        }

        
    }
    public static class PlanRealTimeReportListItem {

        /**
         * 计划id
         */
        @JsonProperty("plan_id")
        private Long planId;

        /**
         * 计划名
         */
        @JsonProperty("plan_name")
        private String planName;

        /**
         * 计划日限额，单位厘
         */
        @JsonProperty("max_cost")
        private Long maxCost;

        /**
         * 1：已启用，2：未启用
         */
        @JsonProperty("operate_status")
        private Integer operateStatus;

        /**
         * 1：余额充足，2：余额不足，3：超出消耗上限
         */
        @JsonProperty("account_status")
        private Integer accountStatus;

        /**
         * 1：推广中，2：手动暂停，3：余额不足，4：到达日限额，5：无推广单元，6：已删除
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 1：已删除，0：未删除
         */
        @JsonProperty("is_deleted")
        private Integer isDeleted;

        /**
         * 推广单元数量
         */
        @JsonProperty("ad_unit_num")
        private Long adUnitNum;

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

        
        public Long getPlanId() {
            return planId;
        }

        public String getPlanName() {
            return planName;
        }

        public Long getMaxCost() {
            return maxCost;
        }

        public Integer getOperateStatus() {
            return operateStatus;
        }

        public Integer getAccountStatus() {
            return accountStatus;
        }

        public Integer getStatus() {
            return status;
        }

        public Integer getIsDeleted() {
            return isDeleted;
        }

        public Long getAdUnitNum() {
            return adUnitNum;
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