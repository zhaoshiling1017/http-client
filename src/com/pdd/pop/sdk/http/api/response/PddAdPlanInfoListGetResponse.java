package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdPlanInfoListGetResponse extends PopBaseHttpResponse{

    /**
     * 计划基础信息表
     */
    @JsonProperty("ad_plan_info_list_response")
    private AdPlanInfoListResponse adPlanInfoListResponse;

    
    public AdPlanInfoListResponse getAdPlanInfoListResponse() {
        return adPlanInfoListResponse;
    }

    
    public static class AdPlanInfoListResponse {

        /**
         * 计划基础信息对象
         */
        @JsonProperty("plan_info_list")
        private List<PlanInfoListItem> planInfoList;

        
        public List<PlanInfoListItem> getPlanInfoList() {
            return planInfoList;
        }

        
    }
    public static class PlanInfoListItem {

        /**
         * 推广单元个数
         */
        @JsonProperty("unit_num")
        private Long unitNum;

        /**
         * 计划日限额，单位厘
         */
        @JsonProperty("max_cost")
        private Long maxCost;

        /**
         * 1 - 余额充足 2 - 余额不足 3 - 超出消耗上限
         */
        @JsonProperty("merchant_account_status")
        private Integer merchantAccountStatus;

        /**
         * 1 - 已启用 2 - 已暂停
         */
        @JsonProperty("merchant_operate_status")
        private Integer merchantOperateStatus;

        /**
         * 0 - 搜索广告
         */
        @JsonProperty("scene_type")
        private Integer sceneType;

        /**
         * 计划名
         */
        @JsonProperty("plan_name")
        private String planName;

        /**
         * 计划id
         */
        @JsonProperty("plan_id")
        private Long planId;

        
        public Long getUnitNum() {
            return unitNum;
        }

        public Long getMaxCost() {
            return maxCost;
        }

        public Integer getMerchantAccountStatus() {
            return merchantAccountStatus;
        }

        public Integer getMerchantOperateStatus() {
            return merchantOperateStatus;
        }

        public Integer getSceneType() {
            return sceneType;
        }

        public String getPlanName() {
            return planName;
        }

        public Long getPlanId() {
            return planId;
        }

        
    }
    
}