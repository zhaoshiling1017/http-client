package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddSmsRemainSettingDetailQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_remain_setting_detail_query_response")
    private SmsRemainSettingDetailQueryResponse smsRemainSettingDetailQueryResponse;

    
    public SmsRemainSettingDetailQueryResponse getSmsRemainSettingDetailQueryResponse() {
        return smsRemainSettingDetailQueryResponse;
    }

    
    public static class SmsRemainSettingDetailQueryResponse {

        /**
         * 是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        /**
         * 错误代码
         */
        @JsonProperty("error_code")
        private Long errorCode;

        /**
         * 错误类型
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 结果
         */
        @JsonProperty("result")
        private Result result;

        
        public Boolean getSuccess() {
            return success;
        }

        public Long getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public Result getResult() {
            return result;
        }

        
    }
    public static class Target {

        /**
         * 商家实收金额，最低价
         */
        @JsonProperty("min_pay_amount")
        private Long minPayAmount;

        /**
         * 商家实收金额，最高价
         */
        @JsonProperty("max_pay_amount")
        private Long maxPayAmount;

        /**
         * 支付金额是否不限
         */
        @JsonProperty("pay_amount_limit")
        private Integer payAmountLimit;

        /**
         * 地区类型
         */
        @JsonProperty("region_type")
        private Integer regionType;

        /**
         * 收货地区
         */
        @JsonProperty("region")
        private List<Integer> region;

        /**
         * 商品id列表
         */
        @JsonProperty("goods")
        private List<Long> goods;

        /**
         * 是否排除商品
         */
        @JsonProperty("goods_invert")
        private Integer goodsInvert;

        
        public Long getMinPayAmount() {
            return minPayAmount;
        }

        public Long getMaxPayAmount() {
            return maxPayAmount;
        }

        public Integer getPayAmountLimit() {
            return payAmountLimit;
        }

        public Integer getRegionType() {
            return regionType;
        }

        public List<Integer> getRegion() {
            return region;
        }

        public List<Long> getGoods() {
            return goods;
        }

        public Integer getGoodsInvert() {
            return goodsInvert;
        }

        
    }
    public static class Result {

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 设置类型
         */
        @JsonProperty("scene")
        private Integer scene;

        /**
         * 触发状态
         */
        @JsonProperty("trigger_condition")
        private TriggerCondition triggerCondition;

        /**
         * 目标
         */
        @JsonProperty("target")
        private Target target;

        /**
         * 模板id
         */
        @JsonProperty("template_id")
        private Long templateId;

        /**
         * 是否开启
         */
        @JsonProperty("open")
        private Integer open;

        /**
         * 全部条数
         */
        @JsonProperty("send_num")
        private Long sendNum;

        /**
         * 失败条数
         */
        @JsonProperty("send_failed_num")
        private Long sendFailedNum;

        
        public Long getMallId() {
            return mallId;
        }

        public Integer getScene() {
            return scene;
        }

        public TriggerCondition getTriggerCondition() {
            return triggerCondition;
        }

        public Target getTarget() {
            return target;
        }

        public Long getTemplateId() {
            return templateId;
        }

        public Integer getOpen() {
            return open;
        }

        public Long getSendNum() {
            return sendNum;
        }

        public Long getSendFailedNum() {
            return sendFailedNum;
        }

        
    }
    public static class TriggerCondition {

        /**
         * 距离系统自动取消订单，单位分钟
         */
        @JsonProperty("unpaid_duration")
        private Long unpaidDuration;

        
        public Long getUnpaidDuration() {
            return unpaidDuration;
        }

        
    }
    
}