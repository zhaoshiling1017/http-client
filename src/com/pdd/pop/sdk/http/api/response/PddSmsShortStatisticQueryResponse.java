package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsShortStatisticQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_short_msg_statistic_query_response")
    private SmsShortMsgStatisticQueryResponse smsShortMsgStatisticQueryResponse;

    
    public SmsShortMsgStatisticQueryResponse getSmsShortMsgStatisticQueryResponse() {
        return smsShortMsgStatisticQueryResponse;
    }

    
    public static class SmsShortMsgStatisticQueryResponse {

        /**
         * return
         */
        @JsonProperty("setting_and_crowd_return_vo")
        private SettingAndCrowdReturnVo settingAndCrowdReturnVo;

        /**
         * statistic_vo
         */
        @JsonProperty("statistic_vo")
        private StatisticVo statisticVo;

        
        public SettingAndCrowdReturnVo getSettingAndCrowdReturnVo() {
            return settingAndCrowdReturnVo;
        }

        public StatisticVo getStatisticVo() {
            return statisticVo;
        }

        
    }
    public static class SettingAndCrowdReturnVo {

        /**
         * 人群id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 人群名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 人群数量
         */
        @JsonProperty("people_num")
        private Long peopleNum;

        /**
         * 发送时间
         */
        @JsonProperty("send_time")
        private Long sendTime;

        
        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Long getPeopleNum() {
            return peopleNum;
        }

        public Long getSendTime() {
            return sendTime;
        }

        
    }
    public static class StatisticVo {

        /**
         * 商家店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 批次id
         */
        @JsonProperty("setting_id")
        private Long settingId;

        /**
         * 场景id
         */
        @JsonProperty("scene")
        private Long scene;

        /**
         * 成功触达人数
         */
        @JsonProperty("sms_succ_cnt_1d")
        private Long smsSuccCnt1d;

        /**
         * 进店人数
         */
        @JsonProperty("online_mall_cnt")
        private Long onlineMallCnt;

        /**
         * 支付订单数量
         */
        @JsonProperty("pay_mall_cnt")
        private Long payMallCnt;

        /**
         * 支付订单数
         */
        @JsonProperty("pay_mall_amt")
        private Double payMallAmt;

        /**
         * 支付订单金额
         */
        @JsonProperty("online_mall_rto")
        private Double onlineMallRto;

        /**
         * 进店转化率
         */
        @JsonProperty("pay_mall_rto")
        private Double payMallRto;

        
        public Long getMallId() {
            return mallId;
        }

        public Long getSettingId() {
            return settingId;
        }

        public Long getScene() {
            return scene;
        }

        public Long getSmsSuccCnt1d() {
            return smsSuccCnt1d;
        }

        public Long getOnlineMallCnt() {
            return onlineMallCnt;
        }

        public Long getPayMallCnt() {
            return payMallCnt;
        }

        public Double getPayMallAmt() {
            return payMallAmt;
        }

        public Double getOnlineMallRto() {
            return onlineMallRto;
        }

        public Double getPayMallRto() {
            return payMallRto;
        }

        
    }
    
}