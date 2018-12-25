package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddAdHistoryRtReportGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("ad_mall_real_time_report_response")
    private AdMallRealTimeReportResponse adMallRealTimeReportResponse;

    
    public AdMallRealTimeReportResponse getAdMallRealTimeReportResponse() {
        return adMallRealTimeReportResponse;
    }

    
    public static class AdMallRealTimeReportResponse {

        /**
         * 广告曝光数
         */
        @JsonProperty("ad_impr_num")
        private Long adImprNum;

        /**
         * 广告点击数
         */
        @JsonProperty("ad_clk_num")
        private Long adClkNum;

        /**
         * 广告消耗
         */
        @JsonProperty("spend")
        private Long spend;

        /**
         * 广告转化支付订单数
         */
        @JsonProperty("pay_order_num")
        private Long payOrderNum;

        /**
         * 广告转化支付金额
         */
        @JsonProperty("pay_gmv")
        private Long payGmv;

        /**
         * 投入产出比
         */
        @JsonProperty("roi")
        private Double roi;

        /**
         * 点击率
         */
        @JsonProperty("click_rate")
        private Double clickRate;

        
        public Long getAdImprNum() {
            return adImprNum;
        }

        public Long getAdClkNum() {
            return adClkNum;
        }

        public Long getSpend() {
            return spend;
        }

        public Long getPayOrderNum() {
            return payOrderNum;
        }

        public Long getPayGmv() {
            return payGmv;
        }

        public Double getRoi() {
            return roi;
        }

        public Double getClickRate() {
            return clickRate;
        }

        
    }
    
}