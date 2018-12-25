package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdCreativeReportGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("ad_creative_report_get_response")
    private AdCreativeReportGetResponse adCreativeReportGetResponse;

    
    public AdCreativeReportGetResponse getAdCreativeReportGetResponse() {
        return adCreativeReportGetResponse;
    }

    
    public static class AdCreativeReportGetResponse {

        /**
         * 数量
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 结果
         */
        @JsonProperty("result")
        private List<ResultItem> result;

        
        public Integer getTotal() {
            return total;
        }

        public List<ResultItem> getResult() {
            return result;
        }

        
    }
    public static class ResultItem {

        /**
         * 日期
         */
        @JsonProperty("date")
        private String date;

        /**
         * 商家id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 计划编号
         */
        @JsonProperty("plan_id")
        private Long planId;

        /**
         * 计划名称
         */
        @JsonProperty("plan_name")
        private String planName;

        /**
         * 单元id
         */
        @JsonProperty("unit_id")
        private String unitId;

        /**
         * 单元名称
         */
        @JsonProperty("unit_name")
        private String unitName;

        /**
         * 创意id
         */
        @JsonProperty("creative_id")
        private String creativeId;

        /**
         * 点位编号
         */
        @JsonProperty("scene_info")
        private String sceneInfo;

        /**
         * 点位名称
         */
        @JsonProperty("idx")
        private String idx;

        /**
         * 展现量
         */
        @JsonProperty("impr_num")
        private Long imprNum;

        /**
         * 点击量
         */
        @JsonProperty("click_num")
        private Long clickNum;

        /**
         * 花费
         */
        @JsonProperty("spend")
        private Long spend;

        /**
         * 成交订单数
         */
        @JsonProperty("pay_order_num")
        private Long payOrderNum;

        /**
         * 成交订单金额
         */
        @JsonProperty("pay_gmv")
        private Long payGmv;

        /**
         * CPT日消耗
         */
        @JsonProperty("plan_cpt_spend")
        private Long planCptSpend;

        /**
         * 跳转URL
         */
        @JsonProperty("page_url")
        private String pageUrl;

        /**
         * 素材URL
         */
        @JsonProperty("image_url")
        private String imageUrl;

        
        public String getDate() {
            return date;
        }

        public Long getMallId() {
            return mallId;
        }

        public Long getPlanId() {
            return planId;
        }

        public String getPlanName() {
            return planName;
        }

        public String getUnitId() {
            return unitId;
        }

        public String getUnitName() {
            return unitName;
        }

        public String getCreativeId() {
            return creativeId;
        }

        public String getSceneInfo() {
            return sceneInfo;
        }

        public String getIdx() {
            return idx;
        }

        public Long getImprNum() {
            return imprNum;
        }

        public Long getClickNum() {
            return clickNum;
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

        public Long getPlanCptSpend() {
            return planCptSpend;
        }

        public String getPageUrl() {
            return pageUrl;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        
    }
    
}